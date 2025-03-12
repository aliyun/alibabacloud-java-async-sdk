// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListApplicationProvisionInfosRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationProvisionInfosRequest</p>
 */
public class ListApplicationProvisionInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ListApplicationProvisionInfosRequest(Builder builder) {
        super(builder);
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationProvisionInfosRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListApplicationProvisionInfosRequest, Builder> {
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationProvisionInfosRequest request) {
            super(request);
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The source of the applications. Valid values:</p>
         * <ul>
         * <li>inner: The applications are from the current account.</li>
         * <li>external: The applications are from other accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>external</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListApplicationProvisionInfosRequest build() {
            return new ListApplicationProvisionInfosRequest(this);
        } 

    } 

}
