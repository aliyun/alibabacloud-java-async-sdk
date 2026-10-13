// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListSyslogsRequest} extends {@link RequestModel}
 *
 * <p>ListSyslogsRequest</p>
 */
public class ListSyslogsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FromTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fromTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reverse")
    private Boolean reverse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String toTime;

    private ListSyslogsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fromTime = builder.fromTime;
        this.nextToken = builder.nextToken;
        this.nodeId = builder.nodeId;
        this.query = builder.query;
        this.reverse = builder.reverse;
        this.toTime = builder.toTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSyslogsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return fromTime
     */
    public String getFromTime() {
        return this.fromTime;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return reverse
     */
    public Boolean getReverse() {
        return this.reverse;
    }

    /**
     * @return toTime
     */
    public String getToTime() {
        return this.toTime;
    }

    public static final class Builder extends Request.Builder<ListSyslogsRequest, Builder> {
        private String regionId; 
        private String fromTime; 
        private String nextToken; 
        private String nodeId; 
        private String query; 
        private Boolean reverse; 
        private String toTime; 

        private Builder() {
            super();
        } 

        private Builder(ListSyslogsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fromTime = request.fromTime;
            this.nextToken = request.nextToken;
            this.nodeId = request.nodeId;
            this.query = request.query;
            this.reverse = request.reverse;
            this.toTime = request.toTime;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The start time. Specify a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1659745800</p>
         */
        public Builder fromTime(String fromTime) {
            this.putBodyParameter("FromTime", fromTime);
            this.fromTime = fromTime;
            return this;
        }

        /**
         * <p>The token for the next page. Include this token when you retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>392e8b4a03ed171433cc39f5b464ec9d</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e01-cn-nwy37atbj44</p>
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The query condition.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>Specifies whether to query logs in reverse chronological order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder reverse(Boolean reverse) {
            this.putBodyParameter("Reverse", reverse);
            this.reverse = reverse;
            return this;
        }

        /**
         * <p>The end time. Specify a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1665369329</p>
         */
        public Builder toTime(String toTime) {
            this.putBodyParameter("ToTime", toTime);
            this.toTime = toTime;
            return this;
        }

        @Override
        public ListSyslogsRequest build() {
            return new ListSyslogsRequest(this);
        } 

    } 

}
