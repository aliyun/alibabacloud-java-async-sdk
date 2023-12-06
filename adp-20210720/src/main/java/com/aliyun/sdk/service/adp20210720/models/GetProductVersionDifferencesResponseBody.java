// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductVersionDifferencesResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductVersionDifferencesResponseBody</p>
 */
public class GetProductVersionDifferencesResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("msg")
    private String msg;

    @NameInMap("requestId")
    private String requestId;

    private GetProductVersionDifferencesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductVersionDifferencesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String msg; 
        private String requestId; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProductVersionDifferencesResponseBody build() {
            return new GetProductVersionDifferencesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("componentName")
        private String componentName;

        @NameInMap("difference")
        private String difference;

        @NameInMap("message")
        private String message;

        @NameInMap("preVersion")
        private String preVersion;

        @NameInMap("releaseName")
        private String releaseName;

        @NameInMap("upgradeFlag")
        private Boolean upgradeFlag;

        @NameInMap("version")
        private String version;

        private Data(Builder builder) {
            this.componentName = builder.componentName;
            this.difference = builder.difference;
            this.message = builder.message;
            this.preVersion = builder.preVersion;
            this.releaseName = builder.releaseName;
            this.upgradeFlag = builder.upgradeFlag;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return difference
         */
        public String getDifference() {
            return this.difference;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return preVersion
         */
        public String getPreVersion() {
            return this.preVersion;
        }

        /**
         * @return releaseName
         */
        public String getReleaseName() {
            return this.releaseName;
        }

        /**
         * @return upgradeFlag
         */
        public Boolean getUpgradeFlag() {
            return this.upgradeFlag;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String componentName; 
            private String difference; 
            private String message; 
            private String preVersion; 
            private String releaseName; 
            private Boolean upgradeFlag; 
            private String version; 

            /**
             * componentName.
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * difference.
             */
            public Builder difference(String difference) {
                this.difference = difference;
                return this;
            }

            /**
             * message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * preVersion.
             */
            public Builder preVersion(String preVersion) {
                this.preVersion = preVersion;
                return this;
            }

            /**
             * releaseName.
             */
            public Builder releaseName(String releaseName) {
                this.releaseName = releaseName;
                return this;
            }

            /**
             * upgradeFlag.
             */
            public Builder upgradeFlag(Boolean upgradeFlag) {
                this.upgradeFlag = upgradeFlag;
                return this;
            }

            /**
             * version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
