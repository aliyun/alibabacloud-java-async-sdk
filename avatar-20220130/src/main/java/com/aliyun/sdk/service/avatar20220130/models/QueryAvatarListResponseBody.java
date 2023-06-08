// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvatarListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAvatarListResponseBody</p>
 */
public class QueryAvatarListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAvatarListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAvatarListResponseBody create() {
        return builder().build();
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAvatarListResponseBody build() {
            return new QueryAvatarListResponseBody(this);
        } 

    } 

    public static class Offline extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private Offline(Builder builder) {
            this.desc = builder.desc;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Offline create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String desc; 
            private Integer height; 
            private Integer width; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Offline build() {
                return new Offline(this);
            } 

        } 

    }
    public static class Online extends TeaModel {
        @NameInMap("Desc")
        private String desc;

        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private Online(Builder builder) {
            this.desc = builder.desc;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Online create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String desc; 
            private Integer height; 
            private Integer width; 

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Online build() {
                return new Online(this);
            } 

        } 

    }
    public static class SupportedResolutions extends TeaModel {
        @NameInMap("Offline")
        private java.util.List < Offline> offline;

        @NameInMap("Online")
        private java.util.List < Online> online;

        private SupportedResolutions(Builder builder) {
            this.offline = builder.offline;
            this.online = builder.online;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedResolutions create() {
            return builder().build();
        }

        /**
         * @return offline
         */
        public java.util.List < Offline> getOffline() {
            return this.offline;
        }

        /**
         * @return online
         */
        public java.util.List < Online> getOnline() {
            return this.online;
        }

        public static final class Builder {
            private java.util.List < Offline> offline; 
            private java.util.List < Online> online; 

            /**
             * Offline.
             */
            public Builder offline(java.util.List < Offline> offline) {
                this.offline = offline;
                return this;
            }

            /**
             * Online.
             */
            public Builder online(java.util.List < Online> online) {
                this.online = online;
                return this;
            }

            public SupportedResolutions build() {
                return new SupportedResolutions(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("AvatarType")
        private String avatarType;

        @NameInMap("Code")
        private String code;

        @NameInMap("Description")
        private String description;

        @NameInMap("Image")
        private String image;

        @NameInMap("ModelType")
        private String modelType;

        @NameInMap("Name")
        private String name;

        @NameInMap("Portrait")
        private String portrait;

        @NameInMap("SupportedResolutions")
        private SupportedResolutions supportedResolutions;

        private List(Builder builder) {
            this.avatarType = builder.avatarType;
            this.code = builder.code;
            this.description = builder.description;
            this.image = builder.image;
            this.modelType = builder.modelType;
            this.name = builder.name;
            this.portrait = builder.portrait;
            this.supportedResolutions = builder.supportedResolutions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return avatarType
         */
        public String getAvatarType() {
            return this.avatarType;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return portrait
         */
        public String getPortrait() {
            return this.portrait;
        }

        /**
         * @return supportedResolutions
         */
        public SupportedResolutions getSupportedResolutions() {
            return this.supportedResolutions;
        }

        public static final class Builder {
            private String avatarType; 
            private String code; 
            private String description; 
            private String image; 
            private String modelType; 
            private String name; 
            private String portrait; 
            private SupportedResolutions supportedResolutions; 

            /**
             * AvatarType.
             */
            public Builder avatarType(String avatarType) {
                this.avatarType = avatarType;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
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
             * Portrait.
             */
            public Builder portrait(String portrait) {
                this.portrait = portrait;
                return this;
            }

            /**
             * SupportedResolutions.
             */
            public Builder supportedResolutions(SupportedResolutions supportedResolutions) {
                this.supportedResolutions = supportedResolutions;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
