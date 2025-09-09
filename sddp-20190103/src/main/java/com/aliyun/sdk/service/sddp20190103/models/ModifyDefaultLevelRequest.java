// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link ModifyDefaultLevelRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefaultLevelRequest</p>
 */
public class ModifyDefaultLevelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultId")
    private Long defaultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SensitiveIds")
    private String sensitiveIds;

    private ModifyDefaultLevelRequest(Builder builder) {
        super(builder);
        this.defaultId = builder.defaultId;
        this.lang = builder.lang;
        this.sensitiveIds = builder.sensitiveIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefaultLevelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultId
     */
    public Long getDefaultId() {
        return this.defaultId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sensitiveIds
     */
    public String getSensitiveIds() {
        return this.sensitiveIds;
    }

    public static final class Builder extends Request.Builder<ModifyDefaultLevelRequest, Builder> {
        private Long defaultId; 
        private String lang; 
        private String sensitiveIds; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefaultLevelRequest request) {
            super(request);
            this.defaultId = request.defaultId;
            this.lang = request.lang;
            this.sensitiveIds = request.sensitiveIds;
        } 

        /**
         * <p>The default sensitivity level of data that Data Security Center (DSC) cannot classify as sensitive or insensitive. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A</li>
         * <li><strong>2</strong>: S1</li>
         * <li><strong>3</strong>: S2</li>
         * <li><strong>4</strong>: S3</li>
         * <li><strong>5</strong>: S4</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder defaultId(Long defaultId) {
            this.putQueryParameter("DefaultId", defaultId);
            this.defaultId = defaultId;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The sensitivity level ID of data that DSC classifies as sensitive. Separate multiple IDs with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: N/A</li>
         * <li><strong>2</strong>: S1</li>
         * <li><strong>3</strong>: S2</li>
         * <li><strong>4</strong>: S3</li>
         * <li><strong>5</strong>: S4</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1,2,3,4</p>
         */
        public Builder sensitiveIds(String sensitiveIds) {
            this.putQueryParameter("SensitiveIds", sensitiveIds);
            this.sensitiveIds = sensitiveIds;
            return this;
        }

        @Override
        public ModifyDefaultLevelRequest build() {
            return new ModifyDefaultLevelRequest(this);
        } 

    } 

}
