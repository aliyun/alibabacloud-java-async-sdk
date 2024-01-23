// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMotionShopTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMotionShopTasksResponseBody</p>
 */
public class ListMotionShopTasksResponseBody extends TeaModel {
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

    private ListMotionShopTasksResponseBody(Builder builder) {
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

    public static ListMotionShopTasksResponseBody create() {
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

        public ListMotionShopTasksResponseBody build() {
            return new ListMotionShopTasksResponseBody(this);
        } 

    } 

    public static class Material extends TeaModel {
        @NameInMap("AvatarId")
        private String avatarId;

        @NameInMap("Box")
        private java.util.List < Double > box;

        @NameInMap("CoverUrl")
        private String coverUrl;

        private Material(Builder builder) {
            this.avatarId = builder.avatarId;
            this.box = builder.box;
            this.coverUrl = builder.coverUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Material create() {
            return builder().build();
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return box
         */
        public java.util.List < Double > getBox() {
            return this.box;
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        public static final class Builder {
            private String avatarId; 
            private java.util.List < Double > box; 
            private String coverUrl; 

            /**
             * AvatarId.
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * Box.
             */
            public Builder box(java.util.List < Double > box) {
                this.box = box;
                return this;
            }

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            public Material build() {
                return new Material(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("CoverUrl")
        private String coverUrl;

        @NameInMap("ShareUrl")
        private String shareUrl;

        @NameInMap("VideoUrl")
        private String videoUrl;

        private Result(Builder builder) {
            this.coverUrl = builder.coverUrl;
            this.shareUrl = builder.shareUrl;
            this.videoUrl = builder.videoUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return coverUrl
         */
        public String getCoverUrl() {
            return this.coverUrl;
        }

        /**
         * @return shareUrl
         */
        public String getShareUrl() {
            return this.shareUrl;
        }

        /**
         * @return videoUrl
         */
        public String getVideoUrl() {
            return this.videoUrl;
        }

        public static final class Builder {
            private String coverUrl; 
            private String shareUrl; 
            private String videoUrl; 

            /**
             * CoverUrl.
             */
            public Builder coverUrl(String coverUrl) {
                this.coverUrl = coverUrl;
                return this;
            }

            /**
             * ShareUrl.
             */
            public Builder shareUrl(String shareUrl) {
                this.shareUrl = shareUrl;
                return this;
            }

            /**
             * VideoUrl.
             */
            public Builder videoUrl(String videoUrl) {
                this.videoUrl = videoUrl;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("Material")
        private Material material;

        @NameInMap("Result")
        private Result result;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.errorMessage = builder.errorMessage;
            this.material = builder.material;
            this.result = builder.result;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return material
         */
        public Material getMaterial() {
            return this.material;
        }

        /**
         * @return result
         */
        public Result getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String errorMessage; 
            private Material material; 
            private Result result; 
            private String status; 
            private String taskId; 

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * Material.
             */
            public Builder material(Material material) {
                this.material = material;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Result result) {
                this.result = result;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
