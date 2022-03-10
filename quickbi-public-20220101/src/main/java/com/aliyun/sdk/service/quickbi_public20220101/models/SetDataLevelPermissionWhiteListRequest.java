// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataLevelPermissionWhiteListRequest} extends {@link RequestModel}
 *
 * <p>SetDataLevelPermissionWhiteListRequest</p>
 */
public class SetDataLevelPermissionWhiteListRequest extends Request {
    @Query
    @NameInMap("WhiteListModel")
    @Validation(required = true)
    private String whiteListModel;

    private SetDataLevelPermissionWhiteListRequest(Builder builder) {
        super(builder);
        this.whiteListModel = builder.whiteListModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataLevelPermissionWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return whiteListModel
     */
    public String getWhiteListModel() {
        return this.whiteListModel;
    }

    public static final class Builder extends Request.Builder<SetDataLevelPermissionWhiteListRequest, Builder> {
        private String whiteListModel; 

        private Builder() {
            super();
        } 

        private Builder(SetDataLevelPermissionWhiteListRequest request) {
            super(request);
            this.whiteListModel = request.whiteListModel;
        } 

        /**
         * WhiteListModel.
         */
        public Builder whiteListModel(String whiteListModel) {
            this.putQueryParameter("WhiteListModel", whiteListModel);
            this.whiteListModel = whiteListModel;
            return this;
        }

        @Override
        public SetDataLevelPermissionWhiteListRequest build() {
            return new SetDataLevelPermissionWhiteListRequest(this);
        } 

    } 

}
