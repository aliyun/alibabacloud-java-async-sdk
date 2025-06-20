// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

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
 * {@link QueryExecuteInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryExecuteInfoRequest</p>
 */
public class QueryExecuteInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Az")
    private java.util.List<String> az;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgVid")
    private String bgVid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuId")
    private String buId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExVid")
    private String exVid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LevelTree")
    private LevelTree levelTree;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Product")
    private java.util.List<String> product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private java.util.List<String> region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceOrderId")
    private String sourceOrderId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private QueryExecuteInfoRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.az = builder.az;
        this.bgVid = builder.bgVid;
        this.buId = builder.buId;
        this.endTime = builder.endTime;
        this.exVid = builder.exVid;
        this.keyword = builder.keyword;
        this.levelTree = builder.levelTree;
        this.limit = builder.limit;
        this.page = builder.page;
        this.product = builder.product;
        this.region = builder.region;
        this.reqTimestamp = builder.reqTimestamp;
        this.source = builder.source;
        this.sourceOrderId = builder.sourceOrderId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryExecuteInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return az
     */
    public java.util.List<String> getAz() {
        return this.az;
    }

    /**
     * @return bgVid
     */
    public String getBgVid() {
        return this.bgVid;
    }

    /**
     * @return buId
     */
    public String getBuId() {
        return this.buId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return exVid
     */
    public String getExVid() {
        return this.exVid;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return levelTree
     */
    public LevelTree getLevelTree() {
        return this.levelTree;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return product
     */
    public java.util.List<String> getProduct() {
        return this.product;
    }

    /**
     * @return region
     */
    public java.util.List<String> getRegion() {
        return this.region;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceOrderId
     */
    public String getSourceOrderId() {
        return this.sourceOrderId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryExecuteInfoRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private java.util.List<String> az; 
        private String bgVid; 
        private String buId; 
        private Long endTime; 
        private String exVid; 
        private String keyword; 
        private LevelTree levelTree; 
        private Integer limit; 
        private Integer page; 
        private java.util.List<String> product; 
        private java.util.List<String> region; 
        private Long reqTimestamp; 
        private String source; 
        private String sourceOrderId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryExecuteInfoRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.az = request.az;
            this.bgVid = request.bgVid;
            this.buId = request.buId;
            this.endTime = request.endTime;
            this.exVid = request.exVid;
            this.keyword = request.keyword;
            this.levelTree = request.levelTree;
            this.limit = request.limit;
            this.page = request.page;
            this.product = request.product;
            this.region = request.region;
            this.reqTimestamp = request.reqTimestamp;
            this.source = request.source;
            this.sourceOrderId = request.sourceOrderId;
            this.startTime = request.startTime;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * Az.
         */
        public Builder az(java.util.List<String> az) {
            this.putBodyParameter("Az", az);
            this.az = az;
            return this;
        }

        /**
         * BgVid.
         */
        public Builder bgVid(String bgVid) {
            this.putBodyParameter("BgVid", bgVid);
            this.bgVid = bgVid;
            return this;
        }

        /**
         * BuId.
         */
        public Builder buId(String buId) {
            this.putBodyParameter("BuId", buId);
            this.buId = buId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ExVid.
         */
        public Builder exVid(String exVid) {
            this.putBodyParameter("ExVid", exVid);
            this.exVid = exVid;
            return this;
        }

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * LevelTree.
         */
        public Builder levelTree(LevelTree levelTree) {
            this.putBodyParameter("LevelTree", levelTree);
            this.levelTree = levelTree;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(java.util.List<String> product) {
            this.putBodyParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(java.util.List<String> region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SourceOrderId.
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.putBodyParameter("SourceOrderId", sourceOrderId);
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryExecuteInfoRequest build() {
            return new QueryExecuteInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryExecuteInfoRequest} extends {@link TeaModel}
     *
     * <p>QueryExecuteInfoRequest</p>
     */
    public static class TreeData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<?> data;

        @com.aliyun.core.annotation.NameInMap("DataSubType")
        private String dataSubType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private TreeData(Builder builder) {
            this.data = builder.data;
            this.dataSubType = builder.dataSubType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TreeData create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<?> getData() {
            return this.data;
        }

        /**
         * @return dataSubType
         */
        public String getDataSubType() {
            return this.dataSubType;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<?> data; 
            private String dataSubType; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(TreeData model) {
                this.data = model.data;
                this.dataSubType = model.dataSubType;
                this.value = model.value;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<?> data) {
                this.data = data;
                return this;
            }

            /**
             * DataSubType.
             */
            public Builder dataSubType(String dataSubType) {
                this.dataSubType = dataSubType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public TreeData build() {
                return new TreeData(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryExecuteInfoRequest} extends {@link TeaModel}
     *
     * <p>QueryExecuteInfoRequest</p>
     */
    public static class LevelTree extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("TreeData")
        private java.util.List<TreeData> treeData;

        private LevelTree(Builder builder) {
            this.dataType = builder.dataType;
            this.treeData = builder.treeData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LevelTree create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return treeData
         */
        public java.util.List<TreeData> getTreeData() {
            return this.treeData;
        }

        public static final class Builder {
            private String dataType; 
            private java.util.List<TreeData> treeData; 

            private Builder() {
            } 

            private Builder(LevelTree model) {
                this.dataType = model.dataType;
                this.treeData = model.treeData;
            } 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * TreeData.
             */
            public Builder treeData(java.util.List<TreeData> treeData) {
                this.treeData = treeData;
                return this;
            }

            public LevelTree build() {
                return new LevelTree(this);
            } 

        } 

    }
}
