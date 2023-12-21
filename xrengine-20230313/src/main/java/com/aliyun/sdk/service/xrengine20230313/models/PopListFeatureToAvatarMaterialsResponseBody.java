// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListFeatureToAvatarMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>PopListFeatureToAvatarMaterialsResponseBody</p>
 */
public class PopListFeatureToAvatarMaterialsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Current")
    private Integer current;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("Pages")
    private Integer pages;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Size")
    private Integer size;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private PopListFeatureToAvatarMaterialsResponseBody(Builder builder) {
        this.code = builder.code;
        this.current = builder.current;
        this.data = builder.data;
        this.message = builder.message;
        this.pages = builder.pages;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListFeatureToAvatarMaterialsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pages
     */
    public Integer getPages() {
        return this.pages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Integer current; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pages; 
        private String requestId; 
        private Integer size; 
        private Boolean success; 
        private Integer total; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.current = current;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Pages.
         */
        public Builder pages(Integer pages) {
            this.pages = pages;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.size = size;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public PopListFeatureToAvatarMaterialsResponseBody build() {
            return new PopListFeatureToAvatarMaterialsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CheckStatus")
        private String checkStatus;

        @NameInMap("Common")
        private Boolean common;

        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("Deleted")
        private Boolean deleted;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Id")
        private String id;

        @NameInMap("Intro")
        private String intro;

        @NameInMap("ListStatus")
        private String listStatus;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.checkStatus = builder.checkStatus;
            this.common = builder.common;
            this.coverUrl = builder.coverUrl;
            this.deleted = builder.deleted;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.id = builder.id;
            this.intro = builder.intro;
            this.listStatus = builder.listStatus;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return common
         */
        public Boolean getCommon() {
            return this.common;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return listStatus
         */
        public String getListStatus() {
            return this.listStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String checkStatus; 
            private Boolean common; 
            private String coverUrl; 
            private Boolean deleted; 
            private String ext; 
            private String fileUrl; 
            private String id; 
            private String intro; 
            private String listStatus; 
            private String name; 
            private String type; 

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * Common.
             */
            public Builder common(Boolean common) {
                this.common = common;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * Ext.
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
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
             * Intro.
             */
            public Builder intro(String intro) {
                this.intro = intro;
                return this;
            }

            /**
             * ListStatus.
             */
            public Builder listStatus(String listStatus) {
                this.listStatus = listStatus;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
