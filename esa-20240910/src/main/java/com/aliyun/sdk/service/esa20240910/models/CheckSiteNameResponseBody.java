// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CheckSiteNameResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSiteNameResponseBody</p>
 */
public class CheckSiteNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("IsSubSite")
    private Boolean isSubSite;

    @com.aliyun.core.annotation.NameInMap("Messeage")
    private String messeage;

    @com.aliyun.core.annotation.NameInMap("Passed")
    private Boolean passed;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckSiteNameResponseBody(Builder builder) {
        this.description = builder.description;
        this.isSubSite = builder.isSubSite;
        this.messeage = builder.messeage;
        this.passed = builder.passed;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSiteNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isSubSite
     */
    public Boolean getIsSubSite() {
        return this.isSubSite;
    }

    /**
     * @return messeage
     */
    public String getMesseage() {
        return this.messeage;
    }

    /**
     * @return passed
     */
    public Boolean getPassed() {
        return this.passed;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String description; 
        private Boolean isSubSite; 
        private String messeage; 
        private Boolean passed; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckSiteNameResponseBody model) {
            this.description = model.description;
            this.isSubSite = model.isSubSite;
            this.messeage = model.messeage;
            this.passed = model.passed;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The description of the verification result. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The verification is successful.</li>
         * <li><strong>Site.AlreadyExist</strong>: The website domain name has already been added.</li>
         * <li><strong>Site.InvalidName</strong>: Invalid website domain name.</li>
         * <li><strong>Site.SubSiteUnavailable</strong>: Subdomains are not allowed.</li>
         * <li><strong>Site.InternalError</strong>: An internal error occurs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether a subdomain is specified. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSubSite(Boolean isSubSite) {
            this.isSubSite = isSubSite;
            return this;
        }

        /**
         * <p>The verification message.</p>
         */
        public Builder messeage(String messeage) {
            this.messeage = messeage;
            return this;
        }

        /**
         * <p>Indicates whether the verification passed.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder passed(Boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CB1A380B-09F0-41BB-280B-72F8FD6DA2FE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckSiteNameResponseBody build() {
            return new CheckSiteNameResponseBody(this);
        } 

    } 

}
