// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryConsumerGroupListRequest} extends {@link RequestModel}
 *
 * <p>QueryConsumerGroupListRequest</p>
 */
public class QueryConsumerGroupListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fuzzy")
    private Boolean fuzzy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubBizCode")
    private String subBizCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private QueryConsumerGroupListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.fuzzy = builder.fuzzy;
        this.groupName = builder.groupName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.subBizCode = builder.subBizCode;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConsumerGroupListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return fuzzy
     */
    public Boolean getFuzzy() {
        return this.fuzzy;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subBizCode
     */
    public String getSubBizCode() {
        return this.subBizCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<QueryConsumerGroupListRequest, Builder> {
        private Integer currentPage; 
        private Boolean fuzzy; 
        private String groupName; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String subBizCode; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(QueryConsumerGroupListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.fuzzy = request.fuzzy;
            this.groupName = request.groupName;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.subBizCode = request.subBizCode;
            this.type = request.type;
        } 

        /**
         * <p>The number of the page to return. Pages start from page 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether to perform a fuzzy search. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a fuzzy search. You must specify the <strong>GroupName</strong> parameter.</li>
         * <li><strong>false</strong>: queries all consumer groups of the current account.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder fuzzy(Boolean fuzzy) {
            this.putQueryParameter("Fuzzy", fuzzy);
            this.fuzzy = fuzzy;
            return this;
        }

        /**
         * <p>The name of the consumer group to be queried. This parameter is required if the <strong>Fuzzy</strong> parameter is set to <strong>true</strong>.</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SubBizCode.
         */
        public Builder subBizCode(String subBizCode) {
            this.putQueryParameter("SubBizCode", subBizCode);
            this.subBizCode = subBizCode;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public QueryConsumerGroupListRequest build() {
            return new QueryConsumerGroupListRequest(this);
        } 

    } 

}
