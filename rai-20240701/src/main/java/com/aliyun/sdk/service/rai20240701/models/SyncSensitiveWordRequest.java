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
 * {@link SyncSensitiveWordRequest} extends {@link RequestModel}
 *
 * <p>SyncSensitiveWordRequest</p>
 */
public class SyncSensitiveWordRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BodyData")
    private BodyData bodyData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Commit")
    private Boolean commit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private SyncSensitiveWordRequest(Builder builder) {
        super(builder);
        this.bodyData = builder.bodyData;
        this.commit = builder.commit;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncSensitiveWordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bodyData
     */
    public BodyData getBodyData() {
        return this.bodyData;
    }

    /**
     * @return commit
     */
    public Boolean getCommit() {
        return this.commit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SyncSensitiveWordRequest, Builder> {
        private BodyData bodyData; 
        private Boolean commit; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SyncSensitiveWordRequest request) {
            super(request);
            this.bodyData = request.bodyData;
            this.commit = request.commit;
            this.regionId = request.regionId;
        } 

        /**
         * BodyData.
         */
        public Builder bodyData(BodyData bodyData) {
            String bodyDataShrink = shrink(bodyData, "BodyData", "json");
            this.putBodyParameter("BodyData", bodyDataShrink);
            this.bodyData = bodyData;
            return this;
        }

        /**
         * Commit.
         */
        public Builder commit(Boolean commit) {
            this.putQueryParameter("Commit", commit);
            this.commit = commit;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SyncSensitiveWordRequest build() {
            return new SyncSensitiveWordRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncSensitiveWordRequest} extends {@link TeaModel}
     *
     * <p>SyncSensitiveWordRequest</p>
     */
    public static class SensitiveWordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private SensitiveWordList(Builder builder) {
            this.id = builder.id;
            this.label = builder.label;
            this.status = builder.status;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveWordList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private Integer id; 
            private String label; 
            private Integer status; 
            private String word; 

            private Builder() {
            } 

            private Builder(SensitiveWordList model) {
                this.id = model.id;
                this.label = model.label;
                this.status = model.status;
                this.word = model.word;
            } 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public SensitiveWordList build() {
                return new SensitiveWordList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncSensitiveWordRequest} extends {@link TeaModel}
     *
     * <p>SyncSensitiveWordRequest</p>
     */
    public static class BodyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SensitiveWordList")
        private java.util.List<SensitiveWordList> sensitiveWordList;

        private BodyData(Builder builder) {
            this.sensitiveWordList = builder.sensitiveWordList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyData create() {
            return builder().build();
        }

        /**
         * @return sensitiveWordList
         */
        public java.util.List<SensitiveWordList> getSensitiveWordList() {
            return this.sensitiveWordList;
        }

        public static final class Builder {
            private java.util.List<SensitiveWordList> sensitiveWordList; 

            private Builder() {
            } 

            private Builder(BodyData model) {
                this.sensitiveWordList = model.sensitiveWordList;
            } 

            /**
             * SensitiveWordList.
             */
            public Builder sensitiveWordList(java.util.List<SensitiveWordList> sensitiveWordList) {
                this.sensitiveWordList = sensitiveWordList;
                return this;
            }

            public BodyData build() {
                return new BodyData(this);
            } 

        } 

    }
}
