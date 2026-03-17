// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSmartAccessGatewayVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartAccessGatewayVersionsResponseBody</p>
 */
public class DescribeSmartAccessGatewayVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmartAGVersions")
    private SmartAGVersions smartAGVersions;

    private DescribeSmartAccessGatewayVersionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.smartAGVersions = builder.smartAGVersions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartAccessGatewayVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smartAGVersions
     */
    public SmartAGVersions getSmartAGVersions() {
        return this.smartAGVersions;
    }

    public static final class Builder {
        private String requestId; 
        private SmartAGVersions smartAGVersions; 

        private Builder() {
        } 

        private Builder(DescribeSmartAccessGatewayVersionsResponseBody model) {
            this.requestId = model.requestId;
            this.smartAGVersions = model.smartAGVersions;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>765AB188-69BF-47C6-BEDD-B9FC72BFBB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the version of the SAG device.</p>
         */
        public Builder smartAGVersions(SmartAGVersions smartAGVersions) {
            this.smartAGVersions = smartAGVersions;
            return this;
        }

        public DescribeSmartAccessGatewayVersionsResponseBody build() {
            return new DescribeSmartAccessGatewayVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSmartAccessGatewayVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayVersionsResponseBody</p>
     */
    public static class SmartAGVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VersionCode")
        private String versionCode;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private SmartAGVersion(Builder builder) {
            this.createTime = builder.createTime;
            this.type = builder.type;
            this.versionCode = builder.versionCode;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAGVersion create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return versionCode
         */
        public String getVersionCode() {
            return this.versionCode;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private Long createTime; 
            private String type; 
            private String versionCode; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(SmartAGVersion model) {
                this.createTime = model.createTime;
                this.type = model.type;
                this.versionCode = model.versionCode;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The timestamp when the version was released.</p>
             * 
             * <strong>example:</strong>
             * <p>1522744623000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the version. Valid values:</p>
             * <ul>
             * <li><strong>beta</strong>: a preview version.</li>
             * <li><strong>release</strong>: an officially released version.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>release</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * <p>The name of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>testpackage1</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public SmartAGVersion build() {
                return new SmartAGVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSmartAccessGatewayVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSmartAccessGatewayVersionsResponseBody</p>
     */
    public static class SmartAGVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmartAGVersion")
        private java.util.List<SmartAGVersion> smartAGVersion;

        private SmartAGVersions(Builder builder) {
            this.smartAGVersion = builder.smartAGVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmartAGVersions create() {
            return builder().build();
        }

        /**
         * @return smartAGVersion
         */
        public java.util.List<SmartAGVersion> getSmartAGVersion() {
            return this.smartAGVersion;
        }

        public static final class Builder {
            private java.util.List<SmartAGVersion> smartAGVersion; 

            private Builder() {
            } 

            private Builder(SmartAGVersions model) {
                this.smartAGVersion = model.smartAGVersion;
            } 

            /**
             * SmartAGVersion.
             */
            public Builder smartAGVersion(java.util.List<SmartAGVersion> smartAGVersion) {
                this.smartAGVersion = smartAGVersion;
                return this;
            }

            public SmartAGVersions build() {
                return new SmartAGVersions(this);
            } 

        } 

    }
}
