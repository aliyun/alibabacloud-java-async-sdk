// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFpShotDBResponseBody} extends {@link TeaModel}
 *
 * <p>ListFpShotDBResponseBody</p>
 */
public class ListFpShotDBResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FpShotDBList")
    private FpShotDBList fpShotDBList;

    @com.aliyun.core.annotation.NameInMap("NonExistIds")
    private NonExistIds nonExistIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFpShotDBResponseBody(Builder builder) {
        this.fpShotDBList = builder.fpShotDBList;
        this.nonExistIds = builder.nonExistIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFpShotDBResponseBody create() {
        return builder().build();
    }

    /**
     * @return fpShotDBList
     */
    public FpShotDBList getFpShotDBList() {
        return this.fpShotDBList;
    }

    /**
     * @return nonExistIds
     */
    public NonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private FpShotDBList fpShotDBList; 
        private NonExistIds nonExistIds; 
        private String requestId; 

        /**
         * The media fingerprint libraries.
         */
        public Builder fpShotDBList(FpShotDBList fpShotDBList) {
            this.fpShotDBList = fpShotDBList;
            return this;
        }

        /**
         * The IDs of the media fingerprint libraries that do not exist.
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFpShotDBResponseBody build() {
            return new ListFpShotDBResponseBody(this);
        } 

    } 

    public static class FpShotDB extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FpDBId")
        private String fpDBId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private Integer modelId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private FpShotDB(Builder builder) {
            this.description = builder.description;
            this.fpDBId = builder.fpDBId;
            this.modelId = builder.modelId;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotDB create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fpDBId
         */
        public String getFpDBId() {
            return this.fpDBId;
        }

        /**
         * @return modelId
         */
        public Integer getModelId() {
            return this.modelId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String fpDBId; 
            private Integer modelId; 
            private String name; 
            private String status; 

            /**
             * The description of the media fingerprint library.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the media fingerprint library.
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * The model ID of the media fingerprint library. A value of **11** indicates that the library is a text fingerprint library. A value of **12** indicates that the library is a video fingerprint library. A value of **13** indicates that the library is an audio fingerprint library. A value of **14** indicates that the library is an image fingerprint library.
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * The name of the media fingerprint library.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the media fingerprint library. Default value: **offline**. ****Valid values:
             * <p>
             * 
             * *   **offline**: The media fingerprint library is offline.
             * *   **active**: The media fingerprint library is online.
             * *   **paused**: The media fingerprint library is paused.
             * *   **deleted**: The media fingerprint library is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public FpShotDB build() {
                return new FpShotDB(this);
            } 

        } 

    }
    public static class FpShotDBList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotDB")
        private java.util.List < FpShotDB> fpShotDB;

        private FpShotDBList(Builder builder) {
            this.fpShotDB = builder.fpShotDB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FpShotDBList create() {
            return builder().build();
        }

        /**
         * @return fpShotDB
         */
        public java.util.List < FpShotDB> getFpShotDB() {
            return this.fpShotDB;
        }

        public static final class Builder {
            private java.util.List < FpShotDB> fpShotDB; 

            /**
             * FpShotDB.
             */
            public Builder fpShotDB(java.util.List < FpShotDB> fpShotDB) {
                this.fpShotDB = fpShotDB;
                return this;
            }

            public FpShotDBList build() {
                return new FpShotDBList(this);
            } 

        } 

    }
    public static class NonExistIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List < String > string;

        private NonExistIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
}
