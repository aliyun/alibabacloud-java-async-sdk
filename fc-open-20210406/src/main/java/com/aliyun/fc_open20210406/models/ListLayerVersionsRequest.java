// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListLayerVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListLayerVersionsRequest</p>
 */
public class ListLayerVersionsRequest extends Request {
    @Path
    @NameInMap("layerName")
    private String layerName;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("startVersion")
    private Integer startVersion;


    private ListLayerVersionsRequest(Builder builder) {
        super(builder);
        this.layerName = builder.layerName;
        this.limit = builder.limit;
        this.startVersion = builder.startVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayerVersionsRequest create() {
        return builder().build();
    }

    /**
     * @return layerName
     */
    public String getLayerName() {
        return this.layerName;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return startVersion
     */
    public Integer getStartVersion() {
        return this.startVersion;
    }

    public static final class Builder extends Request.Builder {
        private String layerName; 
        private Integer limit; 
        private Integer startVersion; 

        /**
         * <p>层名称</p>
         */
        public Builder layerName(String layerName) {
            this.putPathParameter("layerName", layerName);
            this.layerName = layerName;
            return this;
        }

        /**
         * <p>本次读取的最大数据记录数量</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>起始版本</p>
         */
        public Builder startVersion(Integer startVersion) {
            this.putQueryParameter("startVersion", startVersion);
            this.startVersion = startVersion;
            return this;
        }

        public ListLayerVersionsRequest build() {
            return new ListLayerVersionsRequest(this);
        } 

    } 

}
