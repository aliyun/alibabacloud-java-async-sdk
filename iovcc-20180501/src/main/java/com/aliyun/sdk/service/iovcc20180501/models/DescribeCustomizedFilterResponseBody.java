// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizedFilterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedFilterResponseBody</p>
 */
public class DescribeCustomizedFilterResponseBody extends TeaModel {
    @NameInMap("CustomizedFilter")
    private CustomizedFilter customizedFilter;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCustomizedFilterResponseBody(Builder builder) {
        this.customizedFilter = builder.customizedFilter;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedFilterResponseBody create() {
        return builder().build();
    }

    /**
     * @return customizedFilter
     */
    public CustomizedFilter getCustomizedFilter() {
        return this.customizedFilter;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomizedFilter customizedFilter; 
        private String requestId; 

        /**
         * CustomizedFilter.
         */
        public Builder customizedFilter(CustomizedFilter customizedFilter) {
            this.customizedFilter = customizedFilter;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCustomizedFilterResponseBody build() {
            return new DescribeCustomizedFilterResponseBody(this);
        } 

    } 

    public static class CustomizedFilter extends TeaModel {
        @NameInMap("BlackWhiteType")
        private String blackWhiteType;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        private Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        private String gmtModify;

        @NameInMap("GmtModifyTimestamp")
        private Long gmtModifyTimestamp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        @NameInMap("ValueCompareType")
        private String valueCompareType;

        @NameInMap("ValueType")
        private String valueType;

        @NameInMap("VersionId")
        private Long versionId;

        @NameInMap("VersionType")
        private String versionType;

        private CustomizedFilter(Builder builder) {
            this.blackWhiteType = builder.blackWhiteType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtCreateTimestamp = builder.gmtCreateTimestamp;
            this.gmtModify = builder.gmtModify;
            this.gmtModifyTimestamp = builder.gmtModifyTimestamp;
            this.id = builder.id;
            this.name = builder.name;
            this.value = builder.value;
            this.valueCompareType = builder.valueCompareType;
            this.valueType = builder.valueType;
            this.versionId = builder.versionId;
            this.versionType = builder.versionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomizedFilter create() {
            return builder().build();
        }

        /**
         * @return blackWhiteType
         */
        public String getBlackWhiteType() {
            return this.blackWhiteType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtCreateTimestamp
         */
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        /**
         * @return gmtModify
         */
        public String getGmtModify() {
            return this.gmtModify;
        }

        /**
         * @return gmtModifyTimestamp
         */
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return valueCompareType
         */
        public String getValueCompareType() {
            return this.valueCompareType;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        /**
         * @return versionType
         */
        public String getVersionType() {
            return this.versionType;
        }

        public static final class Builder {
            private String blackWhiteType; 
            private String gmtCreate; 
            private Long gmtCreateTimestamp; 
            private String gmtModify; 
            private Long gmtModifyTimestamp; 
            private Long id; 
            private String name; 
            private String value; 
            private String valueCompareType; 
            private String valueType; 
            private Long versionId; 
            private String versionType; 

            /**
             * BlackWhiteType.
             */
            public Builder blackWhiteType(String blackWhiteType) {
                this.blackWhiteType = blackWhiteType;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtCreateTimestamp.
             */
            public Builder gmtCreateTimestamp(Long gmtCreateTimestamp) {
                this.gmtCreateTimestamp = gmtCreateTimestamp;
                return this;
            }

            /**
             * GmtModify.
             */
            public Builder gmtModify(String gmtModify) {
                this.gmtModify = gmtModify;
                return this;
            }

            /**
             * GmtModifyTimestamp.
             */
            public Builder gmtModifyTimestamp(Long gmtModifyTimestamp) {
                this.gmtModifyTimestamp = gmtModifyTimestamp;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
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

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * ValueCompareType.
             */
            public Builder valueCompareType(String valueCompareType) {
                this.valueCompareType = valueCompareType;
                return this;
            }

            /**
             * ValueType.
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * VersionType.
             */
            public Builder versionType(String versionType) {
                this.versionType = versionType;
                return this;
            }

            public CustomizedFilter build() {
                return new CustomizedFilter(this);
            } 

        } 

    }
}
