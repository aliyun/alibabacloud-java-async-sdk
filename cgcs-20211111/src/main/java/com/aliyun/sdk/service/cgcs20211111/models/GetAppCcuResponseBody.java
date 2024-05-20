// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppCcuResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppCcuResponseBody</p>
 */
public class GetAppCcuResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetailList")
    private java.util.List < DetailList> detailList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Timestamp")
    private String timestamp;

    private GetAppCcuResponseBody(Builder builder) {
        this.detailList = builder.detailList;
        this.requestId = builder.requestId;
        this.timestamp = builder.timestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppCcuResponseBody create() {
        return builder().build();
    }

    /**
     * @return detailList
     */
    public java.util.List < DetailList> getDetailList() {
        return this.detailList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    public static final class Builder {
        private java.util.List < DetailList> detailList; 
        private String requestId; 
        private String timestamp; 

        /**
         * DetailList.
         */
        public Builder detailList(java.util.List < DetailList> detailList) {
            this.detailList = detailList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Timestamp.
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public GetAppCcuResponseBody build() {
            return new GetAppCcuResponseBody(this);
        } 

    } 

    public static class DetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("Ccu")
        private String ccu;

        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        private DetailList(Builder builder) {
            this.appId = builder.appId;
            this.appVersion = builder.appVersion;
            this.ccu = builder.ccu;
            this.districtId = builder.districtId;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return ccu
         */
        public String getCcu() {
            return this.ccu;
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String appId; 
            private String appVersion; 
            private String ccu; 
            private String districtId; 
            private String projectId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * Ccu.
             */
            public Builder ccu(String ccu) {
                this.ccu = ccu;
                return this;
            }

            /**
             * DistrictId.
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            public DetailList build() {
                return new DetailList(this);
            } 

        } 

    }
}
