// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForApplyQuickTransferOutOpenlyRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForApplyQuickTransferOutOpenlyRequest</p>
 */
public class SaveBatchTaskForApplyQuickTransferOutOpenlyRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    private java.util.List < String > domainNames;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForApplyQuickTransferOutOpenlyRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForApplyQuickTransferOutOpenlyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public java.util.List < String > getDomainNames() {
        return this.domainNames;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForApplyQuickTransferOutOpenlyRequest, Builder> {
        private java.util.List < String > domainNames; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForApplyQuickTransferOutOpenlyRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(java.util.List < String > domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveBatchTaskForApplyQuickTransferOutOpenlyRequest build() {
            return new SaveBatchTaskForApplyQuickTransferOutOpenlyRequest(this);
        } 

    } 

}
