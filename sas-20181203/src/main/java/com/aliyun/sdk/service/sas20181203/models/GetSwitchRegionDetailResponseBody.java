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
 * {@link GetSwitchRegionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetSwitchRegionDetailResponseBody</p>
 */
public class GetSwitchRegionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSwitchRegionDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwitchRegionDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSwitchRegionDetailResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30CBF632-109F-596F-97F2-451C8B2A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSwitchRegionDetailResponseBody build() {
            return new GetSwitchRegionDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSwitchRegionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSwitchRegionDetailResponseBody</p>
     */
    public static class RegionStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("GmtPlanSwitchTime")
        private Long gmtPlanSwitchTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private RegionStatus(Builder builder) {
            this.ecsCount = builder.ecsCount;
            this.gmtPlanSwitchTime = builder.gmtPlanSwitchTime;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionStatus create() {
            return builder().build();
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return gmtPlanSwitchTime
         */
        public Long getGmtPlanSwitchTime() {
            return this.gmtPlanSwitchTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer ecsCount; 
            private Long gmtPlanSwitchTime; 
            private String regionId; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(RegionStatus model) {
                this.ecsCount = model.ecsCount;
                this.gmtPlanSwitchTime = model.gmtPlanSwitchTime;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * <p>The number of ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>27</p>
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>The time when the migration is scheduled.</p>
             * 
             * <strong>example:</strong>
             * <p>1692858597000</p>
             */
            public Builder gmtPlanSwitchTime(Long gmtPlanSwitchTime) {
                this.gmtPlanSwitchTime = gmtPlanSwitchTime;
                return this;
            }

            /**
             * <p>The region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>us-east-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The migration status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: pending</li>
             * <li><strong>1</strong>: successful</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public RegionStatus build() {
                return new RegionStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSwitchRegionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetSwitchRegionDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtIsAgreeModified")
        private Long gmtIsAgreeModified;

        @com.aliyun.core.annotation.NameInMap("GmtNoticed")
        private Long gmtNoticed;

        @com.aliyun.core.annotation.NameInMap("IsAgree")
        private String isAgree;

        @com.aliyun.core.annotation.NameInMap("IsNoticed")
        private String isNoticed;

        @com.aliyun.core.annotation.NameInMap("RegionStatus")
        private java.util.List<RegionStatus> regionStatus;

        private Data(Builder builder) {
            this.gmtIsAgreeModified = builder.gmtIsAgreeModified;
            this.gmtNoticed = builder.gmtNoticed;
            this.isAgree = builder.isAgree;
            this.isNoticed = builder.isNoticed;
            this.regionStatus = builder.regionStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gmtIsAgreeModified
         */
        public Long getGmtIsAgreeModified() {
            return this.gmtIsAgreeModified;
        }

        /**
         * @return gmtNoticed
         */
        public Long getGmtNoticed() {
            return this.gmtNoticed;
        }

        /**
         * @return isAgree
         */
        public String getIsAgree() {
            return this.isAgree;
        }

        /**
         * @return isNoticed
         */
        public String getIsNoticed() {
            return this.isNoticed;
        }

        /**
         * @return regionStatus
         */
        public java.util.List<RegionStatus> getRegionStatus() {
            return this.regionStatus;
        }

        public static final class Builder {
            private Long gmtIsAgreeModified; 
            private Long gmtNoticed; 
            private String isAgree; 
            private String isNoticed; 
            private java.util.List<RegionStatus> regionStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.gmtIsAgreeModified = model.gmtIsAgreeModified;
                this.gmtNoticed = model.gmtNoticed;
                this.isAgree = model.isAgree;
                this.isNoticed = model.isNoticed;
                this.regionStatus = model.regionStatus;
            } 

            /**
             * <p>The time when the permissions were modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1692858597000</p>
             */
            public Builder gmtIsAgreeModified(Long gmtIsAgreeModified) {
                this.gmtIsAgreeModified = gmtIsAgreeModified;
                return this;
            }

            /**
             * <p>The notification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1692858597000</p>
             */
            public Builder gmtNoticed(Long gmtNoticed) {
                this.gmtNoticed = gmtNoticed;
                return this;
            }

            /**
             * <p>Indicates whether the migration is approved.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAgree(String isAgree) {
                this.isAgree = isAgree;
                return this;
            }

            /**
             * <p>Indicates whether the notification is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder isNoticed(String isNoticed) {
                this.isNoticed = isNoticed;
                return this;
            }

            /**
             * <p>The status of the switching to the region.</p>
             */
            public Builder regionStatus(java.util.List<RegionStatus> regionStatus) {
                this.regionStatus = regionStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
