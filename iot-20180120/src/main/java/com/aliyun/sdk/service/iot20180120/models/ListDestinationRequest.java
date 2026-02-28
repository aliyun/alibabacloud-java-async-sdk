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
 * {@link ListDestinationRequest} extends {@link RequestModel}
 *
 * <p>ListDestinationRequest</p>
 */
public class ListDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchName")
    private String searchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Types")
    private java.util.List<String> types;

    private ListDestinationRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.searchName = builder.searchName;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchName
     */
    public String getSearchName() {
        return this.searchName;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<ListDestinationRequest, Builder> {
        private String iotInstanceId; 
        private Integer page; 
        private Integer pageSize; 
        private String searchName; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(ListDestinationRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.searchName = request.searchName;
            this.types = request.types;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SearchName.
         */
        public Builder searchName(String searchName) {
            this.putQueryParameter("SearchName", searchName);
            this.searchName = searchName;
            return this;
        }

        /**
         * <p>The actions of forwarding data to data destinations. Data is processed by using a parser script before the data is forwarded. Valid values:</p>
         * <ul>
         * <li><strong>REPUBLISH</strong>: forwards topic data to an IoT Platform communication topic.</li>
         * <li><strong>AMQP</strong>: forwards topic data to an Advanced Message Queuing Protocol (AMQP) consumer group.</li>
         * <li><strong>DATAHUB</strong>: forwards topic data to Alibaba Cloud DataHub for stream data processing.</li>
         * <li><strong>ONS</strong>: forwards topic data to Message Queue for Apache RocketMQ for message distribution.</li>
         * <li><strong>MNS</strong>: forwards topic data to Message Service (MNS) for message transmission.</li>
         * <li><strong>FC</strong>: forwards topic data to Function Compute for event computing.</li>
         * <li><strong>OTS</strong>: forwards topic data to Tablestore for NoSQL data storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;REPUBLISH&quot;, &quot;OTS&quot;]</p>
         */
        public Builder types(java.util.List<String> types) {
            this.putQueryParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public ListDestinationRequest build() {
            return new ListDestinationRequest(this);
        } 

    } 

}
