// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNetworkReachableAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkReachableAnalysisResponseBody</p>
 */
public class GetNetworkReachableAnalysisResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private Long aliUid;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("NetworkPathId")
    private String networkPathId;

    @NameInMap("NetworkPathParameter")
    private String networkPathParameter;

    @NameInMap("NetworkReachableAnalysisId")
    private String networkReachableAnalysisId;

    @NameInMap("NetworkReachableAnalysisResult")
    private String networkReachableAnalysisResult;

    @NameInMap("NetworkReachableAnalysisStatus")
    private String networkReachableAnalysisStatus;

    @NameInMap("Reachable")
    private Boolean reachable;

    @NameInMap("RequestId")
    private String requestId;

    private GetNetworkReachableAnalysisResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.createTime = builder.createTime;
        this.networkPathId = builder.networkPathId;
        this.networkPathParameter = builder.networkPathParameter;
        this.networkReachableAnalysisId = builder.networkReachableAnalysisId;
        this.networkReachableAnalysisResult = builder.networkReachableAnalysisResult;
        this.networkReachableAnalysisStatus = builder.networkReachableAnalysisStatus;
        this.reachable = builder.reachable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkReachableAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return networkPathId
     */
    public String getNetworkPathId() {
        return this.networkPathId;
    }

    /**
     * @return networkPathParameter
     */
    public String getNetworkPathParameter() {
        return this.networkPathParameter;
    }

    /**
     * @return networkReachableAnalysisId
     */
    public String getNetworkReachableAnalysisId() {
        return this.networkReachableAnalysisId;
    }

    /**
     * @return networkReachableAnalysisResult
     */
    public String getNetworkReachableAnalysisResult() {
        return this.networkReachableAnalysisResult;
    }

    /**
     * @return networkReachableAnalysisStatus
     */
    public String getNetworkReachableAnalysisStatus() {
        return this.networkReachableAnalysisStatus;
    }

    /**
     * @return reachable
     */
    public Boolean getReachable() {
        return this.reachable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long aliUid; 
        private String createTime; 
        private String networkPathId; 
        private String networkPathParameter; 
        private String networkReachableAnalysisId; 
        private String networkReachableAnalysisResult; 
        private String networkReachableAnalysisStatus; 
        private Boolean reachable; 
        private String requestId; 

        /**
         * The unique ID (UID) of the Alibaba Cloud account.
         */
        public Builder aliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * The time when the network path was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The network path ID.
         */
        public Builder networkPathId(String networkPathId) {
            this.networkPathId = networkPathId;
            return this;
        }

        /**
         * The parameters of the network path.
         */
        public Builder networkPathParameter(String networkPathParameter) {
            this.networkPathParameter = networkPathParameter;
            return this;
        }

        /**
         * The ID of the task for analyzing network reachability.
         */
        public Builder networkReachableAnalysisId(String networkReachableAnalysisId) {
            this.networkReachableAnalysisId = networkReachableAnalysisId;
            return this;
        }

        /**
         * The result of network reachability analysis, which includes the network topology, error codes of network unreachability, and rules of network unreachability.
         */
        public Builder networkReachableAnalysisResult(String networkReachableAnalysisResult) {
            this.networkReachableAnalysisResult = networkReachableAnalysisResult;
            return this;
        }

        /**
         * The state of the task for analyzing network reachability. Valid values:
         * <p>
         * 
         * *   **init**: The task is in progress.
         * *   **finish**: The task is complete.
         * *   **error**: An analysis error occurred.
         * *   **timeout**: The task timed out.
         */
        public Builder networkReachableAnalysisStatus(String networkReachableAnalysisStatus) {
            this.networkReachableAnalysisStatus = networkReachableAnalysisStatus;
            return this;
        }

        /**
         * Indicates whether the network path is reachable. Valid values:
         * <p>
         * 
         * *   **true**: The network path is reachable.
         * *   **false**: The network path is unreachable.
         */
        public Builder reachable(Boolean reachable) {
            this.reachable = reachable;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkReachableAnalysisResponseBody build() {
            return new GetNetworkReachableAnalysisResponseBody(this);
        } 

    } 

}
