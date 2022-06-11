// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllNodeRequest} extends {@link RequestModel}
 *
 * <p>ListAllNodeRequest</p>
 */
public class ListAllNodeRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("body")
    private String body;

    @Query
    @NameInMap("extended")
    private Boolean extended;

    private ListAllNodeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
        this.extended = builder.extended;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllNodeRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return extended
     */
    public Boolean getExtended() {
        return this.extended;
    }

    public static final class Builder extends Request.Builder<ListAllNodeRequest, Builder> {
        private String instanceId; 
        private String body; 
        private Boolean extended; 

        private Builder() {
            super();
        } 

        private Builder(ListAllNodeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
            this.extended = request.extended;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * extended.
         */
        public Builder extended(Boolean extended) {
            this.putQueryParameter("extended", extended);
            this.extended = extended;
            return this;
        }

        @Override
        public ListAllNodeRequest build() {
            return new ListAllNodeRequest(this);
        } 

    } 

}
