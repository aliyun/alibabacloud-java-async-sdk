// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SelectedDomainListRequest} extends {@link RequestModel}
 *
 * <p>SelectedDomainListRequest</p>
 */
public class SelectedDomainListRequest extends Request {
    @Query
    @NameInMap("ListDate")
    @Validation(required = true)
    private String listDate;

    private SelectedDomainListRequest(Builder builder) {
        super(builder);
        this.listDate = builder.listDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectedDomainListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listDate
     */
    public String getListDate() {
        return this.listDate;
    }

    public static final class Builder extends Request.Builder<SelectedDomainListRequest, Builder> {
        private String listDate; 

        private Builder() {
            super();
        } 

        private Builder(SelectedDomainListRequest request) {
            super(request);
            this.listDate = request.listDate;
        } 

        /**
         * ListDate.
         */
        public Builder listDate(String listDate) {
            this.putQueryParameter("ListDate", listDate);
            this.listDate = listDate;
            return this;
        }

        @Override
        public SelectedDomainListRequest build() {
            return new SelectedDomainListRequest(this);
        } 

    } 

}
