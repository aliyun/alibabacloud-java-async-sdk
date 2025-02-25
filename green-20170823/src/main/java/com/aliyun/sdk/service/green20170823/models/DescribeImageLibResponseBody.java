// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageLibResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageLibResponseBody</p>
 */
public class DescribeImageLibResponseBody extends TeaModel {
    @NameInMap("ImageLibList")
    private java.util.List < ImageLibList> imageLibList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeImageLibResponseBody(Builder builder) {
        this.imageLibList = builder.imageLibList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageLibResponseBody create() {
        return builder().build();
    }

    /**
     * @return imageLibList
     */
    public java.util.List < ImageLibList> getImageLibList() {
        return this.imageLibList;
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
        private java.util.List < ImageLibList> imageLibList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ImageLibList.
         */
        public Builder imageLibList(java.util.List < ImageLibList> imageLibList) {
            this.imageLibList = imageLibList;
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

        public DescribeImageLibResponseBody build() {
            return new DescribeImageLibResponseBody(this);
        } 

    } 

    public static class ImageLibList extends TeaModel {
        @NameInMap("BizTypes")
        private java.util.List < String > bizTypes;

        @NameInMap("Category")
        private String category;

        @NameInMap("Code")
        private String code;

        @NameInMap("Enable")
        private String enable;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("ImageCount")
        private Integer imageCount;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("ServiceModule")
        private String serviceModule;

        @NameInMap("Source")
        private String source;

        private ImageLibList(Builder builder) {
            this.bizTypes = builder.bizTypes;
            this.category = builder.category;
            this.code = builder.code;
            this.enable = builder.enable;
            this.id = builder.id;
            this.imageCount = builder.imageCount;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.scene = builder.scene;
            this.serviceModule = builder.serviceModule;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageLibList create() {
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
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
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
         * @return scene
         */
        public String getScene() {
            return this.scene;
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
            private String enable; 
            private Integer id; 
            private Integer imageCount; 
            private String modifiedTime; 
            private String name; 
            private String scene; 
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
             * Enable.
             */
            public Builder enable(String enable) {
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
             * ImageCount.
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
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
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
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

            public ImageLibList build() {
                return new ImageLibList(this);
            } 

        } 

    }
}
