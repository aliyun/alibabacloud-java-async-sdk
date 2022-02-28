// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDialogMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDialogMessagesResponseBody</p>
 */
public class DescribeDialogMessagesResponseBody extends TeaModel {
    @NameInMap("DialogList")
    private java.util.List < DialogList> dialogList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDialogMessagesResponseBody(Builder builder) {
        this.dialogList = builder.dialogList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDialogMessagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return dialogList
     */
    public java.util.List < DialogList> getDialogList() {
        return this.dialogList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DialogList> dialogList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DialogList.
         */
        public Builder dialogList(java.util.List < DialogList> dialogList) {
            this.dialogList = dialogList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDialogMessagesResponseBody build() {
            return new DescribeDialogMessagesResponseBody(this);
        } 

    } 

    public static class DialogList extends TeaModel {
        @NameInMap("DialogKey")
        private String dialogKey;

        @NameInMap("ID")
        private Long ID;

        @NameInMap("Params")
        private String params;

        private DialogList(Builder builder) {
            this.dialogKey = builder.dialogKey;
            this.ID = builder.ID;
            this.params = builder.params;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogList create() {
            return builder().build();
        }

        /**
         * @return dialogKey
         */
        public String getDialogKey() {
            return this.dialogKey;
        }

        /**
         * @return ID
         */
        public Long getID() {
            return this.ID;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        public static final class Builder {
            private String dialogKey; 
            private Long ID; 
            private String params; 

            /**
             * DialogKey.
             */
            public Builder dialogKey(String dialogKey) {
                this.dialogKey = dialogKey;
                return this;
            }

            /**
             * ID.
             */
            public Builder ID(Long ID) {
                this.ID = ID;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(String params) {
                this.params = params;
                return this;
            }

            public DialogList build() {
                return new DialogList(this);
            } 

        } 

    }
}
