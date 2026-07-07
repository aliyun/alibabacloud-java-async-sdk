// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link GetOssStsTokenRequest} extends {@link RequestModel}
 *
 * <p>GetOssStsTokenRequest</p>
 */
public class GetOssStsTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileType")
    private String fileType;

    private GetOssStsTokenRequest(Builder builder) {
        super(builder);
        this.fileType = builder.fileType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssStsTokenRequest create() {
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

    public static final class Builder extends Request.Builder<GetOssStsTokenRequest, Builder> {
        private String fileType; 

        private Builder() {
            super();
        } 

        private Builder(GetOssStsTokenRequest request) {
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
        public GetOssStsTokenRequest build() {
            return new GetOssStsTokenRequest(this);
        } 

    } 

}
