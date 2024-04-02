// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeywordLibResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKeywordLibResponseBody</p>
 */
public class DescribeKeywordLibResponseBody extends TeaModel {
    @NameInMap("KeywordLibList")
    private java.util.List < KeywordLibList> keywordLibList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeKeywordLibResponseBody(Builder builder) {
        this.keywordLibList = builder.keywordLibList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeywordLibResponseBody create() {
        return builder().build();
    }

    /**
     * @return keywordLibList
     */
    public java.util.List < KeywordLibList> getKeywordLibList() {
        return this.keywordLibList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < KeywordLibList> keywordLibList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * KeywordLibList.
         */
        public Builder keywordLibList(java.util.List < KeywordLibList> keywordLibList) {
            this.keywordLibList = keywordLibList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeKeywordLibResponseBody build() {
            return new DescribeKeywordLibResponseBody(this);
        } 

    } 

    public static class KeywordLibList extends TeaModel {
        @NameInMap("BizTypes")
        private java.util.List < String > bizTypes;

        @NameInMap("Category")
        private String category;

        @NameInMap("Code")
        private String code;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("Enable")
        private Boolean enable;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Language")
        private String language;

        @NameInMap("LibType")
        private String libType;

        @NameInMap("MatchMode")
        private String matchMode;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ServiceModule")
        private String serviceModule;

        @NameInMap("Source")
        private String source;

        private KeywordLibList(Builder builder) {
            this.bizTypes = builder.bizTypes;
            this.category = builder.category;
            this.code = builder.code;
            this.count = builder.count;
            this.enable = builder.enable;
            this.id = builder.id;
            this.language = builder.language;
            this.libType = builder.libType;
            this.matchMode = builder.matchMode;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.resourceType = builder.resourceType;
            this.serviceModule = builder.serviceModule;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeywordLibList create() {
            return builder().build();
        }

        /**
         * @return bizTypes
         */
        public java.util.List < String > getBizTypes() {
            return this.bizTypes;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return libType
         */
        public String getLibType() {
            return this.libType;
        }

        /**
         * @return matchMode
         */
        public String getMatchMode() {
            return this.matchMode;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return serviceModule
         */
        public String getServiceModule() {
            return this.serviceModule;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.List < String > bizTypes; 
            private String category; 
            private String code; 
            private Integer count; 
            private Boolean enable; 
            private Integer id; 
            private String language; 
            private String libType; 
            private String matchMode; 
            private String modifiedTime; 
            private String name; 
            private String resourceType; 
            private String serviceModule; 
            private String source; 

            /**
             * BizTypes.
             */
            public Builder bizTypes(java.util.List < String > bizTypes) {
                this.bizTypes = bizTypes;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LibType.
             */
            public Builder libType(String libType) {
                this.libType = libType;
                return this;
            }

            /**
             * MatchMode.
             */
            public Builder matchMode(String matchMode) {
                this.matchMode = matchMode;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * ServiceModule.
             */
            public Builder serviceModule(String serviceModule) {
                this.serviceModule = serviceModule;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public KeywordLibList build() {
                return new KeywordLibList(this);
            } 

        } 

    }
}
