// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

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
 * {@link ListModelInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelInstanceResponseBody</p>
 */
public class ListModelInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ModelInstanceInfoList")
    private java.util.List<ModelInstanceInfoList> modelInstanceInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListModelInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.modelInstanceInfoList = builder.modelInstanceInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelInstanceResponseBody create() {
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
     * @return modelInstanceInfoList
     */
    public java.util.List<ModelInstanceInfoList> getModelInstanceInfoList() {
        return this.modelInstanceInfoList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<ModelInstanceInfoList> modelInstanceInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListModelInstanceResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.modelInstanceInfoList = model.modelInstanceInfoList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
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
         * ModelInstanceInfoList.
         */
        public Builder modelInstanceInfoList(java.util.List<ModelInstanceInfoList> modelInstanceInfoList) {
            this.modelInstanceInfoList = modelInstanceInfoList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListModelInstanceResponseBody build() {
            return new ListModelInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelInstanceResponseBody</p>
     */
    public static class ModelInstanceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EasServiceName")
        private String easServiceName;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("IsSupportContentSafe")
        private Integer isSupportContentSafe;

        @com.aliyun.core.annotation.NameInMap("IsSupportImage")
        private Boolean isSupportImage;

        @com.aliyun.core.annotation.NameInMap("IsSupportPromptAttack")
        private Integer isSupportPromptAttack;

        @com.aliyun.core.annotation.NameInMap("IsSupportSensitiveTopic")
        private Integer isSupportSensitiveTopic;

        @com.aliyun.core.annotation.NameInMap("IsSupportText")
        private Boolean isSupportText;

        @com.aliyun.core.annotation.NameInMap("ModelInstanceId")
        private Long modelInstanceId;

        @com.aliyun.core.annotation.NameInMap("ModelSource")
        private Integer modelSource;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private Long workspaceId;

        private ModelInstanceInfoList(Builder builder) {
            this.easServiceName = builder.easServiceName;
            this.gmtModified = builder.gmtModified;
            this.isSupportContentSafe = builder.isSupportContentSafe;
            this.isSupportImage = builder.isSupportImage;
            this.isSupportPromptAttack = builder.isSupportPromptAttack;
            this.isSupportSensitiveTopic = builder.isSupportSensitiveTopic;
            this.isSupportText = builder.isSupportText;
            this.modelInstanceId = builder.modelInstanceId;
            this.modelSource = builder.modelSource;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelInstanceInfoList create() {
            return builder().build();
        }

        /**
         * @return easServiceName
         */
        public String getEasServiceName() {
            return this.easServiceName;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isSupportContentSafe
         */
        public Integer getIsSupportContentSafe() {
            return this.isSupportContentSafe;
        }

        /**
         * @return isSupportImage
         */
        public Boolean getIsSupportImage() {
            return this.isSupportImage;
        }

        /**
         * @return isSupportPromptAttack
         */
        public Integer getIsSupportPromptAttack() {
            return this.isSupportPromptAttack;
        }

        /**
         * @return isSupportSensitiveTopic
         */
        public Integer getIsSupportSensitiveTopic() {
            return this.isSupportSensitiveTopic;
        }

        /**
         * @return isSupportText
         */
        public Boolean getIsSupportText() {
            return this.isSupportText;
        }

        /**
         * @return modelInstanceId
         */
        public Long getModelInstanceId() {
            return this.modelInstanceId;
        }

        /**
         * @return modelSource
         */
        public Integer getModelSource() {
            return this.modelSource;
        }

        /**
         * @return workspaceId
         */
        public Long getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String easServiceName; 
            private Long gmtModified; 
            private Integer isSupportContentSafe; 
            private Boolean isSupportImage; 
            private Integer isSupportPromptAttack; 
            private Integer isSupportSensitiveTopic; 
            private Boolean isSupportText; 
            private Long modelInstanceId; 
            private Integer modelSource; 
            private Long workspaceId; 

            private Builder() {
            } 

            private Builder(ModelInstanceInfoList model) {
                this.easServiceName = model.easServiceName;
                this.gmtModified = model.gmtModified;
                this.isSupportContentSafe = model.isSupportContentSafe;
                this.isSupportImage = model.isSupportImage;
                this.isSupportPromptAttack = model.isSupportPromptAttack;
                this.isSupportSensitiveTopic = model.isSupportSensitiveTopic;
                this.isSupportText = model.isSupportText;
                this.modelInstanceId = model.modelInstanceId;
                this.modelSource = model.modelSource;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * EasServiceName.
             */
            public Builder easServiceName(String easServiceName) {
                this.easServiceName = easServiceName;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IsSupportContentSafe.
             */
            public Builder isSupportContentSafe(Integer isSupportContentSafe) {
                this.isSupportContentSafe = isSupportContentSafe;
                return this;
            }

            /**
             * IsSupportImage.
             */
            public Builder isSupportImage(Boolean isSupportImage) {
                this.isSupportImage = isSupportImage;
                return this;
            }

            /**
             * IsSupportPromptAttack.
             */
            public Builder isSupportPromptAttack(Integer isSupportPromptAttack) {
                this.isSupportPromptAttack = isSupportPromptAttack;
                return this;
            }

            /**
             * IsSupportSensitiveTopic.
             */
            public Builder isSupportSensitiveTopic(Integer isSupportSensitiveTopic) {
                this.isSupportSensitiveTopic = isSupportSensitiveTopic;
                return this;
            }

            /**
             * IsSupportText.
             */
            public Builder isSupportText(Boolean isSupportText) {
                this.isSupportText = isSupportText;
                return this;
            }

            /**
             * ModelInstanceId.
             */
            public Builder modelInstanceId(Long modelInstanceId) {
                this.modelInstanceId = modelInstanceId;
                return this;
            }

            /**
             * ModelSource.
             */
            public Builder modelSource(Integer modelSource) {
                this.modelSource = modelSource;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(Long workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public ModelInstanceInfoList build() {
                return new ModelInstanceInfoList(this);
            } 

        } 

    }
}
