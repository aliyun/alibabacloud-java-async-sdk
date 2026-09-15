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
 * {@link GetSwitchRegionDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSwitchRegionDetailRequest</p>
 */
public class GetSwitchRegionDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetSwitchRegionDetailRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSwitchRegionDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetSwitchRegionDetailRequest, Builder> {
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetSwitchRegionDetailRequest request) {
            super(request);
            this.lang = request.lang;
            this.type = request.type;
        } 

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The service switchover type. Valid values:</p>
         * <ul>
         * <li><strong>sg_switch</strong>: The server connection is migrated from China to Singapore.</li>
         * <li><strong>sls_meta_version_switch_stage_1</strong>: The log analysis delivery field upgrade switchover.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sg_switch</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetSwitchRegionDetailRequest build() {
            return new GetSwitchRegionDetailRequest(this);
        } 

    } 

}
