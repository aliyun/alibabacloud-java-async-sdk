// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListIndexRecoverRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListIndexRecoverRecordsRequest</p>
 */
public class ListIndexRecoverRecordsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private ListIndexRecoverRecordsRequest(Builder builder) {
        super(builder);
        this.indexName = builder.indexName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIndexRecoverRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListIndexRecoverRecordsRequest, Builder> {
        private String indexName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListIndexRecoverRecordsRequest request) {
            super(request);
            this.indexName = request.indexName;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The index name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>index_jiayi_text</p>
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-i7m2rpzm605</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListIndexRecoverRecordsRequest build() {
            return new ListIndexRecoverRecordsRequest(this);
        } 

    } 

}
