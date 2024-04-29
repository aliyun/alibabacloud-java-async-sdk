// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceRiskLevelsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRiskLevelsRequest</p>
 */
public class ListInstanceRiskLevelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    private ListInstanceRiskLevelsRequest(Builder builder) {
        super(builder);
        this.instanceList = builder.instanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRiskLevelsRequest create() {
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

    public static final class Builder extends Request.Builder<ListInstanceRiskLevelsRequest, Builder> {
        private java.util.List < InstanceList> instanceList; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRiskLevelsRequest request) {
            super(request);
            this.instanceList = request.instanceList;
        } 

        /**
         * The instances.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        @Override
        public ListInstanceRiskLevelsRequest build() {
            return new ListInstanceRiskLevelsRequest(this);
        } 

    } 

    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The serial number of the instance.
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
