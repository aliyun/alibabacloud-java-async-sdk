// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeFrontVulPatchListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFrontVulPatchListResponseBody</p>
 */
public class DescribeFrontVulPatchListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FrontPatchList")
    private java.util.List<FrontPatchList> frontPatchList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFrontVulPatchListResponseBody(Builder builder) {
        this.frontPatchList = builder.frontPatchList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFrontVulPatchListResponseBody create() {
        return builder().build();
    }

    /**
     * @return frontPatchList
     */
    public java.util.List<FrontPatchList> getFrontPatchList() {
        return this.frontPatchList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FrontPatchList> frontPatchList; 
        private String requestId; 

        /**
         * <p>An array consisting of the information about the pre-patches that are required to fix the specified Windows system vulnerability.</p>
         */
        public Builder frontPatchList(java.util.List<FrontPatchList> frontPatchList) {
            this.frontPatchList = frontPatchList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F929E952-EBFC-56C3-BD35-BF8B59024C68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFrontVulPatchListResponseBody build() {
            return new DescribeFrontVulPatchListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFrontVulPatchListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrontVulPatchListResponseBody</p>
     */
    public static class PatchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private PatchList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PatchList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String aliasName; 
            private String name; 

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHBA-2019:2599: krb5 bug fix update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The version number of the pre-patch that is required to fix the Windows system vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>4523204</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public PatchList build() {
                return new PatchList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFrontVulPatchListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFrontVulPatchListResponseBody</p>
     */
    public static class FrontPatchList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PatchList")
        private java.util.List<PatchList> patchList;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private FrontPatchList(Builder builder) {
            this.patchList = builder.patchList;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrontPatchList create() {
            return builder().build();
        }

        /**
         * @return patchList
         */
        public java.util.List<PatchList> getPatchList() {
            return this.patchList;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private java.util.List<PatchList> patchList; 
            private String uuid; 

            /**
             * <p>An array consisting of the pre-patches that are required to fix the specified Windows system vulnerability on the server.</p>
             */
            public Builder patchList(java.util.List<PatchList> patchList) {
                this.patchList = patchList;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>1587bedb-fdb4-48c4-9330-4545****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public FrontPatchList build() {
                return new FrontPatchList(this);
            } 

        } 

    }
}
