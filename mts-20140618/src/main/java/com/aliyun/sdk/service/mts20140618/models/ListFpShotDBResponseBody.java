// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListFpShotDBResponseBody model) {
            this.fpShotDBList = model.fpShotDBList;
            this.nonExistIds = model.nonExistIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The media fingerprint libraries.</p>
         */
        public Builder fpShotDBList(FpShotDBList fpShotDBList) {
            this.fpShotDBList = fpShotDBList;
            return this;
        }

        /**
         * <p>The IDs of the media fingerprint libraries that do not exist.</p>
         */
        public Builder nonExistIds(NonExistIds nonExistIds) {
            this.nonExistIds = nonExistIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFpShotDBResponseBody build() {
            return new ListFpShotDBResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFpShotDBResponseBody} extends {@link TeaModel}
     *
     * <p>ListFpShotDBResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(FpShotDB model) {
                this.description = model.description;
                this.fpDBId = model.fpDBId;
                this.modelId = model.modelId;
                this.name = model.name;
                this.status = model.status;
            } 

            /**
             * <p>The description of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>The library is a text fingerprint library.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>88c6ca184c0e47098a5b665e2a12****</p>
             */
            public Builder fpDBId(String fpDBId) {
                this.fpDBId = fpDBId;
                return this;
            }

            /**
             * <p>The model ID of the media fingerprint library. A value of <strong>11</strong> indicates that the library is a text fingerprint library. A value of <strong>12</strong> indicates that the library is a video fingerprint library. A value of <strong>13</strong> indicates that the library is an audio fingerprint library. A value of <strong>14</strong> indicates that the library is an image fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The name of the media fingerprint library.</p>
             * 
             * <strong>example:</strong>
             * <p>test-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the media fingerprint library. Default value: <strong>offline</strong>. ****Valid values:</p>
             * <ul>
             * <li><strong>offline</strong>: The media fingerprint library is offline.</li>
             * <li><strong>active</strong>: The media fingerprint library is online.</li>
             * <li><strong>paused</strong>: The media fingerprint library is paused.</li>
             * <li><strong>deleted</strong>: The media fingerprint library is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
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
    /**
     * 
     * {@link ListFpShotDBResponseBody} extends {@link TeaModel}
     *
     * <p>ListFpShotDBResponseBody</p>
     */
    public static class FpShotDBList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FpShotDB")
        private java.util.List<FpShotDB> fpShotDB;

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
        public java.util.List<FpShotDB> getFpShotDB() {
            return this.fpShotDB;
        }

        public static final class Builder {
            private java.util.List<FpShotDB> fpShotDB; 

            private Builder() {
            } 

            private Builder(FpShotDBList model) {
                this.fpShotDB = model.fpShotDB;
            } 

            /**
             * FpShotDB.
             */
            public Builder fpShotDB(java.util.List<FpShotDB> fpShotDB) {
                this.fpShotDB = fpShotDB;
                return this;
            }

            public FpShotDBList build() {
                return new FpShotDBList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListFpShotDBResponseBody} extends {@link TeaModel}
     *
     * <p>ListFpShotDBResponseBody</p>
     */
    public static class NonExistIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

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
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            private Builder() {
            } 

            private Builder(NonExistIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistIds build() {
                return new NonExistIds(this);
            } 

        } 

    }
}
