// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link PostInnerReaderRequest} extends {@link RequestModel}
 *
 * <p>PostInnerReaderRequest</p>
 */
public class PostInnerReaderRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceDescriptor")
    private DataSourceDescriptor dataSourceDescriptor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    private PostInnerReaderRequest(Builder builder) {
        super(builder);
        this.dataSourceDescriptor = builder.dataSourceDescriptor;
        this.dataSourceName = builder.dataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostInnerReaderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceDescriptor
     */
    public DataSourceDescriptor getDataSourceDescriptor() {
        return this.dataSourceDescriptor;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static final class Builder extends Request.Builder<PostInnerReaderRequest, Builder> {
        private DataSourceDescriptor dataSourceDescriptor; 
        private String dataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(PostInnerReaderRequest request) {
            super(request);
            this.dataSourceDescriptor = request.dataSourceDescriptor;
            this.dataSourceName = request.dataSourceName;
        } 

        /**
         * dataSourceDescriptor.
         */
        public Builder dataSourceDescriptor(DataSourceDescriptor dataSourceDescriptor) {
            this.putBodyParameter("dataSourceDescriptor", dataSourceDescriptor);
            this.dataSourceDescriptor = dataSourceDescriptor;
            return this;
        }

        /**
         * dataSourceName.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        @Override
        public PostInnerReaderRequest build() {
            return new PostInnerReaderRequest(this);
        } 

    } 

    /**
     * 
     * {@link PostInnerReaderRequest} extends {@link TeaModel}
     *
     * <p>PostInnerReaderRequest</p>
     */
    public static class DataSourceDescriptor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dsName")
        private String dsName;

        private DataSourceDescriptor(Builder builder) {
            this.dsName = builder.dsName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceDescriptor create() {
            return builder().build();
        }

        /**
         * @return dsName
         */
        public String getDsName() {
            return this.dsName;
        }

        public static final class Builder {
            private String dsName; 

            private Builder() {
            } 

            private Builder(DataSourceDescriptor model) {
                this.dsName = model.dsName;
            } 

            /**
             * dsName.
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            public DataSourceDescriptor build() {
                return new DataSourceDescriptor(this);
            } 

        } 

    }
}
