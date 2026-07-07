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
 * {@link ParseSkillPackageRequest} extends {@link RequestModel}
 *
 * <p>ParseSkillPackageRequest</p>
 */
public class ParseSkillPackageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectETag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossObjectETag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssObjectKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossObjectKey;

    private ParseSkillPackageRequest(Builder builder) {
        super(builder);
        this.ossObjectETag = builder.ossObjectETag;
        this.ossObjectKey = builder.ossObjectKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ParseSkillPackageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ossObjectETag
     */
    public String getOssObjectETag() {
        return this.ossObjectETag;
    }

    /**
     * @return ossObjectKey
     */
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

    public static final class Builder extends Request.Builder<ParseSkillPackageRequest, Builder> {
        private String ossObjectETag; 
        private String ossObjectKey; 

        private Builder() {
            super();
        } 

        private Builder(ParseSkillPackageRequest request) {
            super(request);
            this.ossObjectETag = request.ossObjectETag;
            this.ossObjectKey = request.ossObjectKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1D9920C4858A60B70705A8765A******</p>
         */
        public Builder ossObjectETag(String ossObjectETag) {
            this.putQueryParameter("OssObjectETag", ossObjectETag);
            this.ossObjectETag = ossObjectETag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ossObjectKey(String ossObjectKey) {
            this.putQueryParameter("OssObjectKey", ossObjectKey);
            this.ossObjectKey = ossObjectKey;
            return this;
        }

        @Override
        public ParseSkillPackageRequest build() {
            return new ParseSkillPackageRequest(this);
        } 

    } 

}
