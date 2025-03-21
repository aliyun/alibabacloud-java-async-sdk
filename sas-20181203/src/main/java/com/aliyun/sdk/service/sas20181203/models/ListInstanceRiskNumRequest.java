// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceRiskNumRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRiskNumRequest</p>
 */
public class ListInstanceRiskNumRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

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
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static final class Builder extends Request.Builder<ListInstanceRiskNumRequest, Builder> {
        private java.util.List<InstanceList> instanceList; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRiskNumRequest request) {
            super(request);
            this.instanceList = request.instanceList;
        } 

        /**
         * <p>The instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        @Override
        public ListInstanceRiskNumRequest build() {
            return new ListInstanceRiskNumRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceRiskNumRequest} extends {@link TeaModel}
     *
     * <p>ListInstanceRiskNumRequest</p>
     */
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
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9fdluqx20mp2x7****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The UUID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>f2d6e901-1004-4ca8-9dae-53ec04a9****</p>
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
