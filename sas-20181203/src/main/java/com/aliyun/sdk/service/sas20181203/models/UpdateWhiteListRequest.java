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
 * {@link UpdateWhiteListRequest} extends {@link RequestModel}
 *
 * <p>UpdateWhiteListRequest</p>
 */
public class UpdateWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long registryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String whiteList;

    private UpdateWhiteListRequest(Builder builder) {
        super(builder);
        this.registryId = builder.registryId;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registryId
     */
    public Long getRegistryId() {
        return this.registryId;
    }

    /**
     * @return whiteList
     */
    public String getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<UpdateWhiteListRequest, Builder> {
        private Long registryId; 
        private String whiteList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWhiteListRequest request) {
            super(request);
            this.registryId = request.registryId;
            this.whiteList = request.whiteList;
        } 

        /**
         * <p>Image repository ID.</p>
         * <blockquote>
         * <p>You can obtain this parameter by calling the <a href="~~PageImageRegistry~~">PageImageRegistry</a> interface.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>19882</p>
         */
        public Builder registryId(Long registryId) {
            this.putQueryParameter("RegistryId", registryId);
            this.registryId = registryId;
            return this;
        }

        /**
         * <p>Whitelist list. If there are multiple whitelisted addresses, separate them with a comma (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XXX.XXX,192.180.XXX.XXX</p>
         */
        public Builder whiteList(String whiteList) {
            this.putQueryParameter("WhiteList", whiteList);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public UpdateWhiteListRequest build() {
            return new UpdateWhiteListRequest(this);
        } 

    } 

}
