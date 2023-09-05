// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIspTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListIspTypesResponseBody</p>
 */
public class ListIspTypesResponseBody extends TeaModel {
    @NameInMap("IspTypeList")
    private java.util.List < String > ispTypeList;

    @NameInMap("RequestId")
    private String requestId;

    private ListIspTypesResponseBody(Builder builder) {
        this.ispTypeList = builder.ispTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIspTypesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ispTypeList
     */
    public java.util.List < String > getIspTypeList() {
        return this.ispTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > ispTypeList; 
        private String requestId; 

        /**
         * The line types of EIPs in the acceleration region.
         * <p>
         * 
         * *   **BGP** (default): BGP (Multi-ISP) lines
         * *   **BGP_PRO**: BGP (Multi-ISP) Pro lines
         * 
         * If you have the permissions to use single-ISP bandwidth, one of the following values may be returned:
         * 
         * *   **ChinaTelecom**: China Telecom (single ISP)
         * *   **ChinaUnicom**: China Unicom (single ISP)
         * *   **ChinaMobile**: China Mobile (single ISP)
         * *   **ChinaTelecom_L2**: China Telecom_L2 (single ISP)
         * *   **ChinaUnicom_L2**: China Unicom_L2 (single ISP)
         * *   **ChinaMobile_L2**: China Mobile_L2 (single ISP)
         * 
         * > Different acceleration regions support different single-ISP BGP lines.
         */
        public Builder ispTypeList(java.util.List < String > ispTypeList) {
            this.ispTypeList = ispTypeList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIspTypesResponseBody build() {
            return new ListIspTypesResponseBody(this);
        } 

    } 

}
