// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRiskNumRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRiskNumRequest</p>
 */
public class ListInstanceRiskNumRequest extends Request {
    @Query
    @NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    private ListInstanceRiskNumRequest(Builder builder) {
        super(builder);
        this.instanceList = builder.instanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRiskNumRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static final class Builder extends Request.Builder<ListInstanceRiskNumRequest, Builder> {
        private java.util.List < InstanceList> instanceList; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRiskNumRequest request) {
            super(request);
            this.instanceList = request.instanceList;
        } 

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        @Override
        public ListInstanceRiskNumRequest build() {
            return new ListInstanceRiskNumRequest(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Uuid")
        private String uuid;

        private InstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String instanceId; 
            private String uuid; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
