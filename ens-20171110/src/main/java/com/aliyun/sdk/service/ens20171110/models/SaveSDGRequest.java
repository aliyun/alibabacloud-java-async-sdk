// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link SaveSDGRequest} extends {@link RequestModel}
 *
 * <p>SaveSDGRequest</p>
 */
public class SaveSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SDGId")
    private String SDGId;

    private SaveSDGRequest(Builder builder) {
        super(builder);
        this.SDGId = builder.SDGId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSDGRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return SDGId
     */
    public String getSDGId() {
        return this.SDGId;
    }

    public static final class Builder extends Request.Builder<SaveSDGRequest, Builder> {
        private String SDGId; 

        private Builder() {
            super();
        } 

        private Builder(SaveSDGRequest request) {
            super(request);
            this.SDGId = request.SDGId;
        } 

        /**
         * <p>The ID of the SDG to be saved.</p>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxx</p>
         */
        public Builder SDGId(String SDGId) {
            this.putQueryParameter("SDGId", SDGId);
            this.SDGId = SDGId;
            return this;
        }

        @Override
        public SaveSDGRequest build() {
            return new SaveSDGRequest(this);
        } 

    } 

}
