// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateComputeSubQuotaRequest} extends {@link RequestModel}
 *
 * <p>UpdateComputeSubQuotaRequest</p>
 */
public class UpdateComputeSubQuotaRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nickname")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nickname;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subQuotaInfoList")
    private java.util.List<SubQuotaInfoList> subQuotaInfoList;

    private UpdateComputeSubQuotaRequest(Builder builder) {
        super(builder);
        this.nickname = builder.nickname;
        this.subQuotaInfoList = builder.subQuotaInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateComputeSubQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return subQuotaInfoList
     */
    public java.util.List<SubQuotaInfoList> getSubQuotaInfoList() {
        return this.subQuotaInfoList;
    }

    public static final class Builder extends Request.Builder<UpdateComputeSubQuotaRequest, Builder> {
        private String nickname; 
        private java.util.List<SubQuotaInfoList> subQuotaInfoList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateComputeSubQuotaRequest request) {
            super(request);
            this.nickname = request.nickname;
            this.subQuotaInfoList = request.subQuotaInfoList;
        } 

        /**
         * <p>The nickname of level-1 compute quota.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>os_ComputeQuota_p</p>
         */
        public Builder nickname(String nickname) {
            this.putPathParameter("nickname", nickname);
            this.nickname = nickname;
            return this;
        }

        /**
         * <p>The list of level-2 quotas.</p>
         */
        public Builder subQuotaInfoList(java.util.List<SubQuotaInfoList> subQuotaInfoList) {
            this.putBodyParameter("subQuotaInfoList", subQuotaInfoList);
            this.subQuotaInfoList = subQuotaInfoList;
            return this;
        }

        @Override
        public UpdateComputeSubQuotaRequest build() {
            return new UpdateComputeSubQuotaRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateComputeSubQuotaRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeSubQuotaRequest</p>
     */
    public static class Parameter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enablePriority")
        private Boolean enablePriority;

        @com.aliyun.core.annotation.NameInMap("forceReservedMin")
        private Boolean forceReservedMin;

        @com.aliyun.core.annotation.NameInMap("maxCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long maxCU;

        @com.aliyun.core.annotation.NameInMap("minCU")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long minCU;

        @com.aliyun.core.annotation.NameInMap("schedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("singleJobCULimit")
        private Long singleJobCULimit;

        private Parameter(Builder builder) {
            this.enablePriority = builder.enablePriority;
            this.forceReservedMin = builder.forceReservedMin;
            this.maxCU = builder.maxCU;
            this.minCU = builder.minCU;
            this.schedulerType = builder.schedulerType;
            this.singleJobCULimit = builder.singleJobCULimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameter create() {
            return builder().build();
        }

        /**
         * @return enablePriority
         */
        public Boolean getEnablePriority() {
            return this.enablePriority;
        }

        /**
         * @return forceReservedMin
         */
        public Boolean getForceReservedMin() {
            return this.forceReservedMin;
        }

        /**
         * @return maxCU
         */
        public Long getMaxCU() {
            return this.maxCU;
        }

        /**
         * @return minCU
         */
        public Long getMinCU() {
            return this.minCU;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return singleJobCULimit
         */
        public Long getSingleJobCULimit() {
            return this.singleJobCULimit;
        }

        public static final class Builder {
            private Boolean enablePriority; 
            private Boolean forceReservedMin; 
            private Long maxCU; 
            private Long minCU; 
            private String schedulerType; 
            private Long singleJobCULimit; 

            /**
             * <p>Specifies whether to enable the priority feature.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enablePriority(Boolean enablePriority) {
                this.enablePriority = enablePriority;
                return this;
            }

            /**
             * <p>Specifies whether the quota is strongly exclusive.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder forceReservedMin(Boolean forceReservedMin) {
                this.forceReservedMin = forceReservedMin;
                return this;
            }

            /**
             * <p>The value of minCU in Reserved CUs.</p>
             * <blockquote>
             * <p>The value of maxCU must be less than or equal to the value of maxCU in the level-1 quota that you purchased.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder maxCU(Long maxCU) {
                this.maxCU = maxCU;
                return this;
            }

            /**
             * <p>The value of maxCU in Reserved CUs.</p>
             * <blockquote>
             * <ul>
             * <li>The total value of minCU in all the level-2 quotas is equal to the value of minCU in the level-1 quota.</li>
             * <li>The value of minCU must be less than or equal to the value of maxCU in the level-2 quota and less than or equal to the value of minCU in the level-1 quota that you purchased.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder minCU(Long minCU) {
                this.minCU = minCU;
                return this;
            }

            /**
             * <p>Scheduling policy of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>Fifo/Fair</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The upper limit for CUs that can be concurrently used by a job scheduled to the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder singleJobCULimit(Long singleJobCULimit) {
                this.singleJobCULimit = singleJobCULimit;
                return this;
            }

            public Parameter build() {
                return new Parameter(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateComputeSubQuotaRequest} extends {@link TeaModel}
     *
     * <p>UpdateComputeSubQuotaRequest</p>
     */
    public static class SubQuotaInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nickName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("parameter")
        private Parameter parameter;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private SubQuotaInfoList(Builder builder) {
            this.nickName = builder.nickName;
            this.parameter = builder.parameter;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return parameter
         */
        public Parameter getParameter() {
            return this.parameter;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String nickName; 
            private Parameter parameter; 
            private String type; 

            /**
             * <p>The nickname of the level-2 quota.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>os_ComputeQuota</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The parameters of the level-2 quota.</p>
             */
            public Builder parameter(Parameter parameter) {
                this.parameter = parameter;
                return this;
            }

            /**
             * <p>The type of quota.</p>
             * <blockquote>
             * <ul>
             * <li>FUXI_OFFLINE(default) : Quotas of this type are used to run batch jobs.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>FUXI_OFFLINE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SubQuotaInfoList build() {
                return new SubQuotaInfoList(this);
            } 

        } 

    }
}
