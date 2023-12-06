// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchAddEnvironmentNodesRequest} extends {@link RequestModel}
 *
 * <p>BatchAddEnvironmentNodesRequest</p>
 */
public class BatchAddEnvironmentNodesRequest extends Request {
    @Path
    @NameInMap("uid")
    private String uid;

    @Body
    @NameInMap("instanceList")
    private java.util.List < InstanceInfo > instanceList;

    @Body
    @NameInMap("overwrite")
    private Boolean overwrite;

    private BatchAddEnvironmentNodesRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.instanceList = builder.instanceList;
        this.overwrite = builder.overwrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddEnvironmentNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceInfo > getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public static final class Builder extends Request.Builder<BatchAddEnvironmentNodesRequest, Builder> {
        private String uid; 
        private java.util.List < InstanceInfo > instanceList; 
        private Boolean overwrite; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddEnvironmentNodesRequest request) {
            super(request);
            this.uid = request.uid;
            this.instanceList = request.instanceList;
            this.overwrite = request.overwrite;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * instanceList.
         */
        public Builder instanceList(java.util.List < InstanceInfo > instanceList) {
            this.putBodyParameter("instanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        @Override
        public BatchAddEnvironmentNodesRequest build() {
            return new BatchAddEnvironmentNodesRequest(this);
        } 

    } 

}
