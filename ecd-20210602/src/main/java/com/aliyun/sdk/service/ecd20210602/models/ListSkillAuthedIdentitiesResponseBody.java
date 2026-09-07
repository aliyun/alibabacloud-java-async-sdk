// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link ListSkillAuthedIdentitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSkillAuthedIdentitiesResponseBody</p>
 */
public class ListSkillAuthedIdentitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Identities")
    private java.util.List<Identities> identities;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListSkillAuthedIdentitiesResponseBody(Builder builder) {
        this.identities = builder.identities;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillAuthedIdentitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identities
     */
    public java.util.List<Identities> getIdentities() {
        return this.identities;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Identities> identities; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListSkillAuthedIdentitiesResponseBody model) {
            this.identities = model.identities;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of authorized objects.</p>
         */
        public Builder identities(java.util.List<Identities> identities) {
            this.identities = identities;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CC5E450-FC43-4F5B-B540-9964BD*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSkillAuthedIdentitiesResponseBody build() {
            return new ListSkillAuthedIdentitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillAuthedIdentitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListSkillAuthedIdentitiesResponseBody</p>
     */
    public static class Identities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoInstall")
        private Boolean autoInstall;

        @com.aliyun.core.annotation.NameInMap("IdentityId")
        private String identityId;

        private Identities(Builder builder) {
            this.autoInstall = builder.autoInstall;
            this.identityId = builder.identityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identities create() {
            return builder().build();
        }

        /**
         * @return autoInstall
         */
        public Boolean getAutoInstall() {
            return this.autoInstall;
        }

        /**
         * @return identityId
         */
        public String getIdentityId() {
            return this.identityId;
        }

        public static final class Builder {
            private Boolean autoInstall; 
            private String identityId; 

            private Builder() {
            } 

            private Builder(Identities model) {
                this.autoInstall = model.autoInstall;
                this.identityId = model.identityId;
            } 

            /**
             * <p>Indicates whether automatic installation is enabled. Valid values:</p>
             * <ul>
             * <li>true: Automatic installation is enabled.</li>
             * <li>false: Automatic installation is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoInstall(Boolean autoInstall) {
                this.autoInstall = autoInstall;
                return this;
            }

            /**
             * <p>The ID of the authorized object.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-b9ej3xiok4tjbgf9x****</p>
             */
            public Builder identityId(String identityId) {
                this.identityId = identityId;
                return this;
            }

            public Identities build() {
                return new Identities(this);
            } 

        } 

    }
}
