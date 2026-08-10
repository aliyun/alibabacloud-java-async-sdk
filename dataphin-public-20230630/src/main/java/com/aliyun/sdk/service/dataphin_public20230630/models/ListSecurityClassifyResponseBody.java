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
 * {@link ListSecurityClassifyResponseBody} extends {@link TeaModel}
 *
 * <p>ListSecurityClassifyResponseBody</p>
 */
public class ListSecurityClassifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClassifyListResult")
    private ClassifyListResult classifyListResult;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListSecurityClassifyResponseBody(Builder builder) {
        this.classifyListResult = builder.classifyListResult;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityClassifyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classifyListResult
     */
    public ClassifyListResult getClassifyListResult() {
        return this.classifyListResult;
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
        private ClassifyListResult classifyListResult; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListSecurityClassifyResponseBody model) {
            this.classifyListResult = model.classifyListResult;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * ClassifyListResult.
         */
        public Builder classifyListResult(ClassifyListResult classifyListResult) {
            this.classifyListResult = classifyListResult;
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

        public ListSecurityClassifyResponseBody build() {
            return new ListSecurityClassifyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSecurityClassifyResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityClassifyResponseBody</p>
     */
    public static class ClassifyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CatalogPath")
        private String catalogPath;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EffectiveFieldCount")
        private Integer effectiveFieldCount;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsBindDesensitizeRule")
        private Boolean isBindDesensitizeRule;

        @com.aliyun.core.annotation.NameInMap("LevelId")
        private Long levelId;

        @com.aliyun.core.annotation.NameInMap("LevelName")
        private String levelName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ShortName")
        private String shortName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ClassifyList(Builder builder) {
            this.catalogPath = builder.catalogPath;
            this.description = builder.description;
            this.effectiveFieldCount = builder.effectiveFieldCount;
            this.id = builder.id;
            this.isBindDesensitizeRule = builder.isBindDesensitizeRule;
            this.levelId = builder.levelId;
            this.levelName = builder.levelName;
            this.name = builder.name;
            this.priority = builder.priority;
            this.shortName = builder.shortName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassifyList create() {
            return builder().build();
        }

        /**
         * @return catalogPath
         */
        public String getCatalogPath() {
            return this.catalogPath;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return effectiveFieldCount
         */
        public Integer getEffectiveFieldCount() {
            return this.effectiveFieldCount;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isBindDesensitizeRule
         */
        public Boolean getIsBindDesensitizeRule() {
            return this.isBindDesensitizeRule;
        }

        /**
         * @return levelId
         */
        public Long getLevelId() {
            return this.levelId;
        }

        /**
         * @return levelName
         */
        public String getLevelName() {
            return this.levelName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String catalogPath; 
            private String description; 
            private Integer effectiveFieldCount; 
            private Long id; 
            private Boolean isBindDesensitizeRule; 
            private Long levelId; 
            private String levelName; 
            private String name; 
            private Integer priority; 
            private String shortName; 
            private String status; 

            private Builder() {
            } 

            private Builder(ClassifyList model) {
                this.catalogPath = model.catalogPath;
                this.description = model.description;
                this.effectiveFieldCount = model.effectiveFieldCount;
                this.id = model.id;
                this.isBindDesensitizeRule = model.isBindDesensitizeRule;
                this.levelId = model.levelId;
                this.levelName = model.levelName;
                this.name = model.name;
                this.priority = model.priority;
                this.shortName = model.shortName;
                this.status = model.status;
            } 

            /**
             * CatalogPath.
             */
            public Builder catalogPath(String catalogPath) {
                this.catalogPath = catalogPath;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EffectiveFieldCount.
             */
            public Builder effectiveFieldCount(Integer effectiveFieldCount) {
                this.effectiveFieldCount = effectiveFieldCount;
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
             * IsBindDesensitizeRule.
             */
            public Builder isBindDesensitizeRule(Boolean isBindDesensitizeRule) {
                this.isBindDesensitizeRule = isBindDesensitizeRule;
                return this;
            }

            /**
             * LevelId.
             */
            public Builder levelId(Long levelId) {
                this.levelId = levelId;
                return this;
            }

            /**
             * LevelName.
             */
            public Builder levelName(String levelName) {
                this.levelName = levelName;
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
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ShortName.
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ClassifyList build() {
                return new ClassifyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSecurityClassifyResponseBody} extends {@link TeaModel}
     *
     * <p>ListSecurityClassifyResponseBody</p>
     */
    public static class ClassifyListResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClassifyList")
        private java.util.List<ClassifyList> classifyList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private ClassifyListResult(Builder builder) {
            this.classifyList = builder.classifyList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClassifyListResult create() {
            return builder().build();
        }

        /**
         * @return classifyList
         */
        public java.util.List<ClassifyList> getClassifyList() {
            return this.classifyList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<ClassifyList> classifyList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(ClassifyListResult model) {
                this.classifyList = model.classifyList;
                this.totalCount = model.totalCount;
            } 

            /**
             * ClassifyList.
             */
            public Builder classifyList(java.util.List<ClassifyList> classifyList) {
                this.classifyList = classifyList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public ClassifyListResult build() {
                return new ClassifyListResult(this);
            } 

        } 

    }
}
