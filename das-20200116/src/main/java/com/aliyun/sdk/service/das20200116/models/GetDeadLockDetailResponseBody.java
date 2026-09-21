// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link GetDeadLockDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeadLockDetailResponseBody</p>
 */
public class GetDeadLockDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private String synchro;

    private GetDeadLockDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeadLockDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return synchro
     */
    public String getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private String success; 
        private String synchro; 

        private Builder() {
        } 

        private Builder(GetDeadLockDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data in JSON format:</p>
         * <ul>
         * <li><p>accountId: the user ID.</p>
         * </li>
         * <li><p>textId: the deadlock text ID.</p>
         * </li>
         * <li><p>gmtModified: the time when the diagnosis was generated.</p>
         * </li>
         * <li><p>originText: the original deadlock text of LATEST DETECTED DEADLOCK or the original deadlock text in the error log.</p>
         * </li>
         * <li><p>deadlock: the deadlock details:</p>
         * <ul>
         * <li><p>occurTime: the time when the deadlock occurred.</p>
         * </li>
         * <li><p>originTextId: the deadlock text ID.</p>
         * </li>
         * <li><p>rollbackTrxId: the ID of the rolled back transaction.</p>
         * </li>
         * <li><p>transactions:</p>
         * <ul>
         * <li><p>deadlockIdInDB: the deadlock ID in the database.</p>
         * </li>
         * <li><p>ip: the access IP address.</p>
         * </li>
         * <li><p>queryId: the query ID.</p>
         * </li>
         * <li><p>queryType: the query type.</p>
         * </li>
         * <li><p>relatedTables: the related tables.</p>
         * </li>
         * <li><p>tableNamesString: the related tables.</p>
         * </li>
         * <li><p>sqlText: the SQL text.</p>
         * </li>
         * <li><p>threadId: the thread ID.</p>
         * </li>
         * <li><p>transactionId: the transaction ID.</p>
         * </li>
         * <li><p>trxIdInLock: the transaction ID in the deadlock.</p>
         * </li>
         * <li><p>userName: the database username.</p>
         * </li>
         * <li><p>waitLockIndexName: the name of the index for which the lock is waiting.</p>
         * </li>
         * <li><p>waitLockMode: the type of the lock that is waiting.</p>
         * </li>
         * <li><p>lockWait: the waiting lock.</p>
         * </li>
         * <li><p>holdLockIndexName: the name of the index for which the lock is held.</p>
         * </li>
         * <li><p>holdLockMode: the type of the lock that is held.</p>
         * </li>
         * <li><p>lockHold: the held lock.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>trxNum: the number of transactions.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p>gmtCreate: the time when the diagnosis was created.</p>
         * </li>
         * <li><p>nodeId: the node ID.</p>
         * </li>
         * <li><p>uuid: the instance ID.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;accountId&quot;: &quot;108************&quot;,
         *     &quot;textId&quot;: &quot;35303d12d52d29ba73bb************&quot;,
         *     &quot;gmtModified&quot;: 1732712680000,
         *     &quot;originText&quot;: &quot;LATEST DETECTED DEADLOCK****&quot;,
         *     &quot;deadlock&quot;: &quot;{\&quot;id\&quot;:0,\&quot;occurTime\&quot;:1732687047000,\&quot;originTextId\&quot;:\&quot;35303d12d52d29ba73bb************\&quot;,\&quot;rollbackTrxId\&quot;:\&quot;2\&quot;,\&quot;transactions\&quot;:[{\&quot;deadlockIdInDB\&quot;:0,\&quot;ip\&quot;:\&quot;100.<em><strong>.</strong></em>.<em><strong>\&quot;,\&quot;lockWait\&quot;:\&quot;index PRIMARY of table <code>das</code>.<code>students</code> trx id 15989454 lock_mode X locks rec but not gap waiting\&quot;,\&quot;queryId\&quot;:\&quot;386737457\&quot;,\&quot;queryType\&quot;:\&quot;updating\&quot;,\&quot;relatedTables\&quot;:[\&quot;<code>das</code>.<code>students</code>\&quot;],\&quot;sqlText\&quot;:\&quot;update students set name=UUID() where id = 2 \&quot;,\&quot;tableNamesString\&quot;:\&quot;<code>das</code>.<code>students</code>\&quot;,\&quot;threadId\&quot;:\&quot;9194526\&quot;,\&quot;transactionId\&quot;:\&quot;15989454\&quot;,\&quot;trxIdInLock\&quot;:1,\&quot;userName\&quot;:\&quot;das\&quot;,\&quot;waitLockIndexName\&quot;:\&quot;PRIMARY \&quot;,\&quot;waitLockMode\&quot;:\&quot;X locks rec but not gap waiting\&quot;},{\&quot;deadlockIdInDB\&quot;:0,\&quot;holdLockIndexName\&quot;:\&quot;PRIMARY \&quot;,\&quot;holdLockMode\&quot;:\&quot;X locks rec but not gap\&quot;,\&quot;ip\&quot;:\&quot;100.</strong></em>.<em><strong>.</strong></em>\&quot;,\&quot;lockHold\&quot;:\&quot;index PRIMARY of table <code>das</code>.<code>students</code> trx id 15989451 lock_mode X locks rec but not gap\&quot;,\&quot;lockWait\&quot;:\&quot;index PRIMARY of table <code>das</code>.<code>students</code> trx id 15989451 lock_mode X locks rec but not gap waiting\&quot;,\&quot;queryId\&quot;:\&quot;386737566\&quot;,\&quot;queryType\&quot;:\&quot;updating\&quot;,\&quot;relatedTables\&quot;:[\&quot;<code>das</code>.<code>students</code>\&quot;],\&quot;sqlText\&quot;:\&quot;update students set name=UUID() where id = 3 \&quot;,\&quot;tableNamesString\&quot;:\&quot;<code>das</code>.<code>students</code>\&quot;,\&quot;threadId\&quot;:\&quot;9194501\&quot;,\&quot;transactionId\&quot;:\&quot;15989451\&quot;,\&quot;trxIdInLock\&quot;:2,\&quot;userName\&quot;:\&quot;das\&quot;,\&quot;waitLockIndexName\&quot;:\&quot;PRIMARY \&quot;,\&quot;waitLockMode\&quot;:\&quot;X locks rec but not gap waiting\&quot;}],\&quot;trxNum\&quot;:2}&quot;,
         *     &quot;gmtCreate&quot;: 1732712680000,
         *     &quot;nodeId&quot;: &quot;pi-8****************&quot;,
         *     &quot;uuid&quot;: &quot;pc-8v***************&quot;
         * }</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * <blockquote>
         * <ul>
         * <li><p>When the request is successful, <strong>Successful</strong> is returned.</p>
         * </li>
         * <li><p>When the request fails, error information (such as error codes) is returned.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9CB97BC4-6479-55D0-B9D0-EA925AFE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder synchro(String synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetDeadLockDetailResponseBody build() {
            return new GetDeadLockDetailResponseBody(this);
        } 

    } 

}
