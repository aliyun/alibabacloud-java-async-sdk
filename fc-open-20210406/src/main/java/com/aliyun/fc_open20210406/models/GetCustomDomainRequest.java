// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetCustomDomainRequest} extends {@link RequestModel}
 *
 * <p>GetCustomDomainRequest</p>
 */
public class GetCustomDomainRequest extends Request {
    @Path
    @NameInMap("domainName")
    private String domainName;


    private GetCustomDomainRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomDomainRequest create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    public static final class Builder extends Request.Builder {
        private String domainName; 

        /**
         * <p>domainName.</p>
         */
        public Builder domainName(String domainName) {
            this.putPathParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        public GetCustomDomainRequest build() {
            return new GetCustomDomainRequest(this);
        } 

    } 

}
