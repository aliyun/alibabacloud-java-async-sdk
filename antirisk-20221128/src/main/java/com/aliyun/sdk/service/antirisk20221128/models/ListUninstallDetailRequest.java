// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUninstallDetailRequest} extends {@link RequestModel}
 *
 * <p>ListUninstallDetailRequest</p>
 */
public class ListUninstallDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDs;

    private ListUninstallDetailRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.endDs = builder.endDs;
        this.startDs = builder.startDs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUninstallDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return endDs
     */
    public String getEndDs() {
        return this.endDs;
    }

    /**
     * @return startDs
     */
    public String getStartDs() {
        return this.startDs;
    }

    public static final class Builder extends Request.Builder<ListUninstallDetailRequest, Builder> {
        private String dataSourceId; 
        private String endDs; 
        private String startDs; 

        private Builder() {
            super();
        } 

        private Builder(ListUninstallDetailRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.endDs = request.endDs;
            this.startDs = request.startDs;
        } 

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * endDs.
         */
        public Builder endDs(String endDs) {
            this.putQueryParameter("endDs", endDs);
            this.endDs = endDs;
            return this;
        }

        /**
         * startDs.
         */
        public Builder startDs(String startDs) {
            this.putQueryParameter("startDs", startDs);
            this.startDs = startDs;
            return this;
        }

        @Override
        public ListUninstallDetailRequest build() {
            return new ListUninstallDetailRequest(this);
        } 

    } 

}
