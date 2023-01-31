// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DuplicateScriptRequest} extends {@link RequestModel}
 *
 * <p>DuplicateScriptRequest</p>
 */
public class DuplicateScriptRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("SourceScriptId")
    @Validation(required = true)
    private String sourceScriptId;

    private DuplicateScriptRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.sourceScriptId = builder.sourceScriptId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DuplicateScriptRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sourceScriptId
     */
    public String getSourceScriptId() {
        return this.sourceScriptId;
    }

    public static final class Builder extends Request.Builder<DuplicateScriptRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String sourceScriptId; 

        private Builder() {
            super();
        } 

        private Builder(DuplicateScriptRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.sourceScriptId = request.sourceScriptId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SourceScriptId.
         */
        public Builder sourceScriptId(String sourceScriptId) {
            this.putQueryParameter("SourceScriptId", sourceScriptId);
            this.sourceScriptId = sourceScriptId;
            return this;
        }

        @Override
        public DuplicateScriptRequest build() {
            return new DuplicateScriptRequest(this);
        } 

    } 

}
