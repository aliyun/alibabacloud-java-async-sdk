// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetQualityAlertOfAllRuleScopeByWatchIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityAlertOfAllRuleScopeByWatchIdResponseBody</p>
 */
public class GetQualityAlertOfAllRuleScopeByWatchIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("QualityAlertInfo")
    private QualityAlertInfo qualityAlertInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityAlertOfAllRuleScopeByWatchIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.qualityAlertInfo = builder.qualityAlertInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityAlertOfAllRuleScopeByWatchIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return qualityAlertInfo
     */
    public QualityAlertInfo getQualityAlertInfo() {
        return this.qualityAlertInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private QualityAlertInfo qualityAlertInfo; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetQualityAlertOfAllRuleScopeByWatchIdResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.qualityAlertInfo = model.qualityAlertInfo;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * QualityAlertInfo.
         */
        public Builder qualityAlertInfo(QualityAlertInfo qualityAlertInfo) {
            this.qualityAlertInfo = qualityAlertInfo;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityAlertOfAllRuleScopeByWatchIdResponseBody build() {
            return new GetQualityAlertOfAllRuleScopeByWatchIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityAlertOfAllRuleScopeByWatchIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityAlertOfAllRuleScopeByWatchIdResponseBody</p>
     */
    public static class AlertDutyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AlertDutyList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertDutyList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(AlertDutyList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AlertDutyList build() {
                return new AlertDutyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityAlertOfAllRuleScopeByWatchIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityAlertOfAllRuleScopeByWatchIdResponseBody</p>
     */
    public static class AlertUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private AlertUserList(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertUserList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(AlertUserList model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AlertUserList build() {
                return new AlertUserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetQualityAlertOfAllRuleScopeByWatchIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityAlertOfAllRuleScopeByWatchIdResponseBody</p>
     */
    public static class QualityAlertInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertDutyChannelList")
        private java.util.List<String> alertDutyChannelList;

        @com.aliyun.core.annotation.NameInMap("AlertDutyList")
        private java.util.List<AlertDutyList> alertDutyList;

        @com.aliyun.core.annotation.NameInMap("AlertQualityOwnerChannelList")
        private java.util.List<String> alertQualityOwnerChannelList;

        @com.aliyun.core.annotation.NameInMap("AlertUserChannelList")
        private java.util.List<String> alertUserChannelList;

        @com.aliyun.core.annotation.NameInMap("AlertUserList")
        private java.util.List<AlertUserList> alertUserList;

        @com.aliyun.core.annotation.NameInMap("EnableAlertQualityOwner")
        private Boolean enableAlertQualityOwner;

        @com.aliyun.core.annotation.NameInMap("WatchId")
        private Long watchId;

        private QualityAlertInfo(Builder builder) {
            this.alertDutyChannelList = builder.alertDutyChannelList;
            this.alertDutyList = builder.alertDutyList;
            this.alertQualityOwnerChannelList = builder.alertQualityOwnerChannelList;
            this.alertUserChannelList = builder.alertUserChannelList;
            this.alertUserList = builder.alertUserList;
            this.enableAlertQualityOwner = builder.enableAlertQualityOwner;
            this.watchId = builder.watchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualityAlertInfo create() {
            return builder().build();
        }

        /**
         * @return alertDutyChannelList
         */
        public java.util.List<String> getAlertDutyChannelList() {
            return this.alertDutyChannelList;
        }

        /**
         * @return alertDutyList
         */
        public java.util.List<AlertDutyList> getAlertDutyList() {
            return this.alertDutyList;
        }

        /**
         * @return alertQualityOwnerChannelList
         */
        public java.util.List<String> getAlertQualityOwnerChannelList() {
            return this.alertQualityOwnerChannelList;
        }

        /**
         * @return alertUserChannelList
         */
        public java.util.List<String> getAlertUserChannelList() {
            return this.alertUserChannelList;
        }

        /**
         * @return alertUserList
         */
        public java.util.List<AlertUserList> getAlertUserList() {
            return this.alertUserList;
        }

        /**
         * @return enableAlertQualityOwner
         */
        public Boolean getEnableAlertQualityOwner() {
            return this.enableAlertQualityOwner;
        }

        /**
         * @return watchId
         */
        public Long getWatchId() {
            return this.watchId;
        }

        public static final class Builder {
            private java.util.List<String> alertDutyChannelList; 
            private java.util.List<AlertDutyList> alertDutyList; 
            private java.util.List<String> alertQualityOwnerChannelList; 
            private java.util.List<String> alertUserChannelList; 
            private java.util.List<AlertUserList> alertUserList; 
            private Boolean enableAlertQualityOwner; 
            private Long watchId; 

            private Builder() {
            } 

            private Builder(QualityAlertInfo model) {
                this.alertDutyChannelList = model.alertDutyChannelList;
                this.alertDutyList = model.alertDutyList;
                this.alertQualityOwnerChannelList = model.alertQualityOwnerChannelList;
                this.alertUserChannelList = model.alertUserChannelList;
                this.alertUserList = model.alertUserList;
                this.enableAlertQualityOwner = model.enableAlertQualityOwner;
                this.watchId = model.watchId;
            } 

            /**
             * AlertDutyChannelList.
             */
            public Builder alertDutyChannelList(java.util.List<String> alertDutyChannelList) {
                this.alertDutyChannelList = alertDutyChannelList;
                return this;
            }

            /**
             * AlertDutyList.
             */
            public Builder alertDutyList(java.util.List<AlertDutyList> alertDutyList) {
                this.alertDutyList = alertDutyList;
                return this;
            }

            /**
             * AlertQualityOwnerChannelList.
             */
            public Builder alertQualityOwnerChannelList(java.util.List<String> alertQualityOwnerChannelList) {
                this.alertQualityOwnerChannelList = alertQualityOwnerChannelList;
                return this;
            }

            /**
             * AlertUserChannelList.
             */
            public Builder alertUserChannelList(java.util.List<String> alertUserChannelList) {
                this.alertUserChannelList = alertUserChannelList;
                return this;
            }

            /**
             * AlertUserList.
             */
            public Builder alertUserList(java.util.List<AlertUserList> alertUserList) {
                this.alertUserList = alertUserList;
                return this;
            }

            /**
             * EnableAlertQualityOwner.
             */
            public Builder enableAlertQualityOwner(Boolean enableAlertQualityOwner) {
                this.enableAlertQualityOwner = enableAlertQualityOwner;
                return this;
            }

            /**
             * WatchId.
             */
            public Builder watchId(Long watchId) {
                this.watchId = watchId;
                return this;
            }

            public QualityAlertInfo build() {
                return new QualityAlertInfo(this);
            } 

        } 

    }
}
