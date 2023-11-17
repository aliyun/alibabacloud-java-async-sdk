// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarTaskAndActionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSoarTaskAndActionsRequest</p>
 */
public class DescribeSoarTaskAndActionsRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RequestUuid")
    private String requestUuid;

    private DescribeSoarTaskAndActionsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.requestUuid = builder.requestUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarTaskAndActionsRequest create() {
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
     * @return requestUuid
     */
    public String getRequestUuid() {
        return this.requestUuid;
    }

    public static final class Builder extends Request.Builder<DescribeSoarTaskAndActionsRequest, Builder> {
        private String lang; 
        private String requestUuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSoarTaskAndActionsRequest request) {
            super(request);
            this.lang = request.lang;
            this.requestUuid = request.requestUuid;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RequestUuid.
         */
        public Builder requestUuid(String requestUuid) {
            this.putQueryParameter("RequestUuid", requestUuid);
            this.requestUuid = requestUuid;
            return this;
        }

        @Override
        public DescribeSoarTaskAndActionsRequest build() {
            return new DescribeSoarTaskAndActionsRequest(this);
        } 

    } 

}
