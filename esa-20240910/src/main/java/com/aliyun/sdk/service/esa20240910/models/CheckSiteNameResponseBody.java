// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * IsSubSite.
         */
        public Builder isSubSite(Boolean isSubSite) {
            this.isSubSite = isSubSite;
            return this;
        }

        /**
         * Messeage.
         */
        public Builder messeage(String messeage) {
            this.messeage = messeage;
            return this;
        }

        /**
         * Passed.
         */
        public Builder passed(Boolean passed) {
            this.passed = passed;
            return this;
        }

        /**
         * RequestId.
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
