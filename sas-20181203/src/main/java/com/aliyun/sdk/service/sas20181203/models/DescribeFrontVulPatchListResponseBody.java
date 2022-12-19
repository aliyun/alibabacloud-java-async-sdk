// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFrontVulPatchListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFrontVulPatchListResponseBody</p>
 */
public class DescribeFrontVulPatchListResponseBody extends TeaModel {
    @NameInMap("FrontPatchList")
    private java.util.List < FrontPatchList> frontPatchList;

    @NameInMap("RequestId")
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
    public java.util.List < FrontPatchList> getFrontPatchList() {
        return this.frontPatchList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FrontPatchList> frontPatchList; 
        private String requestId; 

        /**
         * An array consisting of the information about the pre-patches that are required to fix the specified Windows system vulnerability.
         */
        public Builder frontPatchList(java.util.List < FrontPatchList> frontPatchList) {
            this.frontPatchList = frontPatchList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFrontVulPatchListResponseBody build() {
            return new DescribeFrontVulPatchListResponseBody(this);
        } 

    } 

    public static class PatchList extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Name")
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
             * The name of the Windows system vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The version number of the pre-patch that is required to fix the Windows system vulnerability.
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
    public static class FrontPatchList extends TeaModel {
        @NameInMap("PatchList")
        private java.util.List < PatchList> patchList;

        @NameInMap("Uuid")
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
        public java.util.List < PatchList> getPatchList() {
            return this.patchList;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private java.util.List < PatchList> patchList; 
            private String uuid; 

            /**
             * An array consisting of the pre-patches that are required to fix the specified Windows system vulnerability on the server.
             */
            public Builder patchList(java.util.List < PatchList> patchList) {
                this.patchList = patchList;
                return this;
            }

            /**
             * The UUID of the server.
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
