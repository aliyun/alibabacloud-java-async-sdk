// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link DescribeBucketsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBucketsRequest</p>
 */
public class DescribeBucketsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    private DescribeBucketsRequest(Builder builder) {
        super(builder);
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBucketsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    public static final class Builder extends Request.Builder<DescribeBucketsRequest, Builder> {
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBucketsRequest request) {
            super(request);
            this.fileType = request.fileType;
        } 

        /**
         * FileType.
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        @Override
        public DescribeBucketsRequest build() {
            return new DescribeBucketsRequest(this);
        } 

    } 

}
