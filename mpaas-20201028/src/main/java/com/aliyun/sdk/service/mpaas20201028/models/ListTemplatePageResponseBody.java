// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

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
 * {@link ListTemplatePageResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatePageResponseBody</p>
 */
public class ListTemplatePageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private ListTemplatePageResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.msg = builder.msg;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatePageResponseBody create() {
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
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private java.util.List<Data> data; 
        private String msg; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(ListTemplatePageResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.data = model.data;
            this.msg = model.msg;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalSize = model.totalSize;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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
         * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
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
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public ListTemplatePageResponseBody build() {
            return new ListTemplatePageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTemplatePageResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatePageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("DescInfo")
        private String descInfo;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IconUrls")
        private String iconUrls;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ImageUrls")
        private String imageUrls;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PushStyle")
        private String pushStyle;

        @com.aliyun.core.annotation.NameInMap("ShowStyle")
        private String showStyle;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private String variables;

        private Data(Builder builder) {
            this.action = builder.action;
            this.content = builder.content;
            this.descInfo = builder.descInfo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.iconUrls = builder.iconUrls;
            this.id = builder.id;
            this.imageUrls = builder.imageUrls;
            this.name = builder.name;
            this.pushStyle = builder.pushStyle;
            this.showStyle = builder.showStyle;
            this.title = builder.title;
            this.uri = builder.uri;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return descInfo
         */
        public String getDescInfo() {
            return this.descInfo;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return iconUrls
         */
        public String getIconUrls() {
            return this.iconUrls;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return imageUrls
         */
        public String getImageUrls() {
            return this.imageUrls;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pushStyle
         */
        public String getPushStyle() {
            return this.pushStyle;
        }

        /**
         * @return showStyle
         */
        public String getShowStyle() {
            return this.showStyle;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        /**
         * @return variables
         */
        public String getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String action; 
            private String content; 
            private String descInfo; 
            private String gmtCreate; 
            private String gmtModified; 
            private String iconUrls; 
            private String id; 
            private String imageUrls; 
            private String name; 
            private String pushStyle; 
            private String showStyle; 
            private String title; 
            private String uri; 
            private String variables; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.action = model.action;
                this.content = model.content;
                this.descInfo = model.descInfo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.iconUrls = model.iconUrls;
                this.id = model.id;
                this.imageUrls = model.imageUrls;
                this.name = model.name;
                this.pushStyle = model.pushStyle;
                this.showStyle = model.showStyle;
                this.title = model.title;
                this.uri = model.uri;
                this.variables = model.variables;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DescInfo.
             */
            public Builder descInfo(String descInfo) {
                this.descInfo = descInfo;
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
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IconUrls.
             */
            public Builder iconUrls(String iconUrls) {
                this.iconUrls = iconUrls;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ImageUrls.
             */
            public Builder imageUrls(String imageUrls) {
                this.imageUrls = imageUrls;
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
             * PushStyle.
             */
            public Builder pushStyle(String pushStyle) {
                this.pushStyle = pushStyle;
                return this;
            }

            /**
             * ShowStyle.
             */
            public Builder showStyle(String showStyle) {
                this.showStyle = showStyle;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            /**
             * Variables.
             */
            public Builder variables(String variables) {
                this.variables = variables;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
