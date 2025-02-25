// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDigitalHumanMaterialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDigitalHumanMaterialsResponseBody</p>
 */
public class ListDigitalHumanMaterialsResponseBody extends TeaModel {
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

    private ListDigitalHumanMaterialsResponseBody(Builder builder) {
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

    public static ListDigitalHumanMaterialsResponseBody create() {
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

        public ListDigitalHumanMaterialsResponseBody build() {
            return new ListDigitalHumanMaterialsResponseBody(this);
        } 

    } 

    public static class Components extends TeaModel {
        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Files")
        private java.util.Map < String, ? > files;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Components(Builder builder) {
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.files = builder.files;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
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
         * @return files
         */
        public java.util.Map < String, ? > getFiles() {
            return this.files;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ext; 
            private String fileUrl; 
            private java.util.Map < String, ? > files; 
            private String id; 
            private String name; 
            private String type; 

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
             * Files.
             */
            public Builder files(java.util.Map < String, ? > files) {
                this.files = files;
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

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Components")
        private java.util.List < Components> components;

        @NameInMap("Ext")
        private String ext;

        @NameInMap("FileUrl")
        private String fileUrl;

        @NameInMap("Files")
        private java.util.Map < String, ? > files;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("SortOrder")
        private Integer sortOrder;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.components = builder.components;
            this.ext = builder.ext;
            this.fileUrl = builder.fileUrl;
            this.files = builder.files;
            this.id = builder.id;
            this.name = builder.name;
            this.sortOrder = builder.sortOrder;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return components
         */
        public java.util.List < Components> getComponents() {
            return this.components;
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
         * @return files
         */
        public java.util.Map < String, ? > getFiles() {
            return this.files;
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

        /**
         * @return sortOrder
         */
        public Integer getSortOrder() {
            return this.sortOrder;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Components> components; 
            private String ext; 
            private String fileUrl; 
            private java.util.Map < String, ? > files; 
            private String id; 
            private String name; 
            private Integer sortOrder; 
            private String type; 

            /**
             * Components.
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
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
             * Files.
             */
            public Builder files(java.util.Map < String, ? > files) {
                this.files = files;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SortOrder.
             */
            public Builder sortOrder(Integer sortOrder) {
                this.sortOrder = sortOrder;
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
