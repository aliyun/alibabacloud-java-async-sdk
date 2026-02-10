// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link UpdateMultimodalLabelStudioServiceWhiteListRequest} extends {@link RequestModel}
 *
 * <p>UpdateMultimodalLabelStudioServiceWhiteListRequest</p>
 */
public class UpdateMultimodalLabelStudioServiceWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteList")
    private java.util.List<String> whiteList;

    private UpdateMultimodalLabelStudioServiceWhiteListRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.whiteList = builder.whiteList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMultimodalLabelStudioServiceWhiteListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return whiteList
     */
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

    public static final class Builder extends Request.Builder<UpdateMultimodalLabelStudioServiceWhiteListRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<String> whiteList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMultimodalLabelStudioServiceWhiteListRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.whiteList = request.whiteList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * WhiteList.
         */
        public Builder whiteList(java.util.List<String> whiteList) {
            String whiteListShrink = shrink(whiteList, "WhiteList", "json");
            this.putQueryParameter("WhiteList", whiteListShrink);
            this.whiteList = whiteList;
            return this;
        }

        @Override
        public UpdateMultimodalLabelStudioServiceWhiteListRequest build() {
            return new UpdateMultimodalLabelStudioServiceWhiteListRequest(this);
        } 

    } 

}
