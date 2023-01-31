// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpnGatewayDiagnoseResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpnGatewayDiagnoseResultResponseBody</p>
 */
public class GetVpnGatewayDiagnoseResultResponseBody extends TeaModel {
    @NameInMap("BeginTime")
    private String beginTime;

    @NameInMap("DiagnoseId")
    private String diagnoseId;

    @NameInMap("DiagnoseResult")
    private java.util.List < DiagnoseResult> diagnoseResult;

    @NameInMap("FinishTime")
    private String finishTime;

    @NameInMap("FinishedCount")
    private Integer finishedCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @NameInMap("ResourceType")
    private String resourceType;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpnGatewayId")
    private String vpnGatewayId;

    private GetVpnGatewayDiagnoseResultResponseBody(Builder builder) {
        this.beginTime = builder.beginTime;
        this.diagnoseId = builder.diagnoseId;
        this.diagnoseResult = builder.diagnoseResult;
        this.finishTime = builder.finishTime;
        this.finishedCount = builder.finishedCount;
        this.requestId = builder.requestId;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceType = builder.resourceType;
        this.totalCount = builder.totalCount;
        this.vpnGatewayId = builder.vpnGatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpnGatewayDiagnoseResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return diagnoseId
     */
    public String getDiagnoseId() {
        return this.diagnoseId;
    }

    /**
     * @return diagnoseResult
     */
    public java.util.List < DiagnoseResult> getDiagnoseResult() {
        return this.diagnoseResult;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return finishedCount
     */
    public Integer getFinishedCount() {
        return this.finishedCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vpnGatewayId
     */
    public String getVpnGatewayId() {
        return this.vpnGatewayId;
    }

    public static final class Builder {
        private String beginTime; 
        private String diagnoseId; 
        private java.util.List < DiagnoseResult> diagnoseResult; 
        private String finishTime; 
        private Integer finishedCount; 
        private String requestId; 
        private String resourceInstanceId; 
        private String resourceType; 
        private Integer totalCount; 
        private String vpnGatewayId; 

        /**
         * FinishTime
         */
        public Builder beginTime(String beginTime) {
            this.beginTime = beginTime;
            return this;
        }

        /**
         * DiagnoseId
         */
        public Builder diagnoseId(String diagnoseId) {
            this.diagnoseId = diagnoseId;
            return this;
        }

        /**
         * DiagnoseResult
         */
        public Builder diagnoseResult(java.util.List < DiagnoseResult> diagnoseResult) {
            this.diagnoseResult = diagnoseResult;
            return this;
        }

        /**
         * FinishTime
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * FinishedCount
         */
        public Builder finishedCount(Integer finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceInstanceId
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * ResourceType
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * TotalCount
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * VpnGatewayId
         */
        public Builder vpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }

        public GetVpnGatewayDiagnoseResultResponseBody build() {
            return new GetVpnGatewayDiagnoseResultResponseBody(this);
        } 

    } 

    public static class DiagnoseResult extends TeaModel {
        @NameInMap("DiagnoseName")
        private String diagnoseName;

        @NameInMap("DiagnoseResultDescription")
        private String diagnoseResultDescription;

        @NameInMap("DiagnoseResultLevel")
        private String diagnoseResultLevel;

        private DiagnoseResult(Builder builder) {
            this.diagnoseName = builder.diagnoseName;
            this.diagnoseResultDescription = builder.diagnoseResultDescription;
            this.diagnoseResultLevel = builder.diagnoseResultLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiagnoseResult create() {
            return builder().build();
        }

        /**
         * @return diagnoseName
         */
        public String getDiagnoseName() {
            return this.diagnoseName;
        }

        /**
         * @return diagnoseResultDescription
         */
        public String getDiagnoseResultDescription() {
            return this.diagnoseResultDescription;
        }

        /**
         * @return diagnoseResultLevel
         */
        public String getDiagnoseResultLevel() {
            return this.diagnoseResultLevel;
        }

        public static final class Builder {
            private String diagnoseName; 
            private String diagnoseResultDescription; 
            private String diagnoseResultLevel; 

            /**
             * diagnoseName
             */
            public Builder diagnoseName(String diagnoseName) {
                this.diagnoseName = diagnoseName;
                return this;
            }

            /**
             * DiagnoseResultDescription
             */
            public Builder diagnoseResultDescription(String diagnoseResultDescription) {
                this.diagnoseResultDescription = diagnoseResultDescription;
                return this;
            }

            /**
             * DiagnoseResultLevel
             */
            public Builder diagnoseResultLevel(String diagnoseResultLevel) {
                this.diagnoseResultLevel = diagnoseResultLevel;
                return this;
            }

            public DiagnoseResult build() {
                return new DiagnoseResult(this);
            } 

        } 

    }
}
