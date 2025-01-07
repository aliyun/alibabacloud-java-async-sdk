// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageBaselineDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageBaselineDetailRequest</p>
 */
public class DescribeImageBaselineDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineItemKey")
    private String baselineItemKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUuid")
    private String imageUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeImageBaselineDetailRequest(Builder builder) {
        super(builder);
        this.baselineItemKey = builder.baselineItemKey;
        this.imageUuid = builder.imageUuid;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBaselineDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineItemKey
     */
    public String getBaselineItemKey() {
        return this.baselineItemKey;
    }

    /**
     * @return imageUuid
     */
    public String getImageUuid() {
        return this.imageUuid;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeImageBaselineDetailRequest, Builder> {
        private String baselineItemKey; 
        private String imageUuid; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageBaselineDetailRequest request) {
            super(request);
            this.baselineItemKey = request.baselineItemKey;
            this.imageUuid = request.imageUuid;
            this.lang = request.lang;
        } 

        /**
         * <p>The information about the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Valid values include but are not limited to ak_leak, duplicate_uid, duplicate_pwd_hash, and non_pwd_user.</p>
         */
        public Builder baselineItemKey(String baselineItemKey) {
            this.putQueryParameter("BaselineItemKey", baselineItemKey);
            this.baselineItemKey = baselineItemKey;
            return this;
        }

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>06293273b67d19516cfcc712194f****</p>
         */
        public Builder imageUuid(String imageUuid) {
            this.putQueryParameter("ImageUuid", imageUuid);
            this.imageUuid = imageUuid;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeImageBaselineDetailRequest build() {
            return new DescribeImageBaselineDetailRequest(this);
        } 

    } 

}
