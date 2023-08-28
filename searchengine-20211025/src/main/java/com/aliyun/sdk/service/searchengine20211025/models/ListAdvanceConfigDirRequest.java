// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAdvanceConfigDirRequest} extends {@link RequestModel}
 *
 * <p>ListAdvanceConfigDirRequest</p>
 */
public class ListAdvanceConfigDirRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("configName")
    @Validation(required = true)
    private String configName;

    @Query
    @NameInMap("dirName")
    @Validation(required = true)
    private String dirName;

    private ListAdvanceConfigDirRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.dirName = builder.dirName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAdvanceConfigDirRequest create() {
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
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return dirName
     */
    public String getDirName() {
        return this.dirName;
    }

    public static final class Builder extends Request.Builder<ListAdvanceConfigDirRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String dirName; 

        private Builder() {
            super();
        } 

        private Builder(ListAdvanceConfigDirRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.dirName = request.dirName;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * configName.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * dirName.
         */
        public Builder dirName(String dirName) {
            this.putQueryParameter("dirName", dirName);
            this.dirName = dirName;
            return this;
        }

        @Override
        public ListAdvanceConfigDirRequest build() {
            return new ListAdvanceConfigDirRequest(this);
        } 

    } 

}
