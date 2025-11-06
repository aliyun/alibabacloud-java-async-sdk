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
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetTemplateResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateResponseBody create() {
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
     * @return data
     */
    public Data getData() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetTemplateResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
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
         * Data.
         */
        public Builder data(Data data) {
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
         * <p>Id of the request</p>
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

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetTemplateResponseBody</p>
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
